package com.example.cargarregistrosredpasiva.service;

import com.example.cargarregistrosredpasiva.dto.PasivaDto;
import com.example.cargarregistrosredpasiva.dto.ResponsePasivaDto;
import com.example.cargarregistrosredpasiva.entity.*;
import com.example.cargarregistrosredpasiva.repository.*;
import org.locationtech.proj4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class PasivaService {

    @Autowired private MunicipioRepository pasivaRepository;
    @Autowired private EstacionRepository estacionRepository;
    @Autowired private EstaciontipoRepository estaciontipoRepository;
    @Autowired private PuntoreferenciaRepository puntoreferenciaRepository;
    @Autowired private MaterializacionRepository materializacionRepository;
    @Autowired private MaterializaciontipoRepository materializaciontipoRepository;


    public List<ResponsePasivaDto> procesarPasiva(List<PasivaDto> pasivaDto){
        List<ResponsePasivaDto> responseListaPasivaDto = new ArrayList<>();

        int estadoVertice = 0;
        int idMunicipio = 0;

        for(PasivaDto pasivaDto1 : pasivaDto){

            try {



            ResponsePasivaDto responsePasivaDto = new ResponsePasivaDto();

            estadoVertice = pasivaDto1.getEstacionDto().getEstado_vertice().equals("Materializado")  ? 2 : 1;

            idMunicipio = pasivaRepository.findMunicipioByNombre(pasivaDto1.getEstacionDto().getMunicipio()).getT_id();
;
            double lat = transformacionCoordenadas(pasivaDto1.getEstacionDto().getLatitud(), pasivaDto1.getEstacionDto().getLongitud()).get(0);
            double lon = transformacionCoordenadas(pasivaDto1.getEstacionDto().getLatitud(), pasivaDto1.getEstacionDto().getLongitud()).get(1);



            Estacion estacion = estacionRepository.saveEstacion(
                    pasivaDto1.getEstacionDto().getIdentificador(),
                    pasivaDto1.getEstacionDto().getNomenclatura(),
                    estadoVertice,
                    idMunicipio,
                    pasivaDto1.getEstacionDto().getLatitud(),
                    pasivaDto1.getEstacionDto().getLongitud(),
                    pasivaDto1.getEstacionDto().getAltura_elipsoidal(),
                    pasivaDto1.getEstacionDto().getAgencia(),
                    lon,
                    lat
            );

            // AGREGA RESPUESTA DE LA ESTACION
            responsePasivaDto.setEstacion(estacion);

            estaciontipoRepository.save(new EstacionTipo(2, estacion.getT_id()));

            List<PuntosReferencia> listaPuntosReferencia = new ArrayList<>();
            for(PuntosReferencia puntosReferencia : pasivaDto1.getPuntosReferencia()){
                PuntosReferencia puntosReferencia1 =  puntoreferenciaRepository.save(new PuntosReferencia(
                        puntosReferencia.getAzimut(),
                        puntosReferencia.getDistancia(),
                        puntosReferencia.getObjeto(),
                        estacion.getT_id()
                ));

                // AGREGAR RESPUESTA DE LOS PUNTOS DE REFERENCIA
                listaPuntosReferencia.add(puntosReferencia1);
            }
            // AGREGA LISTA DE PUNTOS DE REFERENCIA A LA RESPUESTA
            responsePasivaDto.setPuntosReferencia(listaPuntosReferencia);

            MaterializacionTipo materializacionTipo = materializaciontipoRepository.findMaterializacionTipoByDispname(pasivaDto1.getMaterializacionDto().getTipo_materializacion());

            Materializacion materializacion = materializacionRepository.save(new Materializacion(
                    pasivaDto1.getMaterializacionDto().getLugar_materializacion(),
                    materializacionTipo.getT_id(),
                    pasivaDto1.getMaterializacionDto().getFecha_materializacion(),
                    pasivaDto1.getMaterializacionDto().getFecha_descripcion(),
                    pasivaDto1.getMaterializacionDto().getMonumentado_por_1(),
                    pasivaDto1.getMaterializacionDto().getAncho_mts(),
                    pasivaDto1.getMaterializacionDto().getLargo_mts(),
                    pasivaDto1.getMaterializacionDto().getAltura_mts(),
                    pasivaDto1.getMaterializacionDto().getObservacion(),
                    pasivaDto1.getMaterializacionDto().getActualizó(),
                    pasivaDto1.getMaterializacionDto().getDescripción_detallada(),
                    pasivaDto1.getMaterializacionDto().getAcceso_general(),
                    pasivaDto1.getMaterializacionDto().getRegistrado_por(),
                    estacion.getT_id()
            ));

            responsePasivaDto.setMaterializacion(materializacion);


                responseListaPasivaDto.add(responsePasivaDto);

            }catch (Exception e){
                System.out.println(e);
            }

        }


        return responseListaPasivaDto;
    }

    private List<Double> transformacionCoordenadas(double latitud, double longitud){

        String parametros = "+proj=tmerc +lat_0=4.0 +lon_0=-73.0 +k=0.9992 +x_0=5000000 +y_0=2000000 +ellps=GRS80 +towgs84=0,0,0,0,0,0,0 +units=m +no_defs";
        CRSFactory crsFactory = new CRSFactory();
        CoordinateReferenceSystem fuente = crsFactory.createFromParameters("EPSG:4326", "+proj=longlat +datum=WGS84 +no_defs");
        CoordinateReferenceSystem destino = crsFactory.createFromParameters("EPSG:9377", parametros);

        CoordinateTransformFactory transformFactory = new CoordinateTransformFactory();

        CoordinateTransform transformacion = transformFactory.createTransform(fuente, destino);

        // Crea las coordenadas de origen
        ProjCoordinate coordenadasOrigen = new ProjCoordinate(longitud, latitud);

        // Realiza la transformación
        ProjCoordinate coordenadasDestino = new ProjCoordinate();
        transformacion.transform(coordenadasOrigen, coordenadasDestino);
        //System.out.println(transformacion.transform(coordenadasOrigen, coordenadasDestino));

        // Imprime las coordenadas proyectadas
        //System.out.println(coordenadasDestino.x + "" + coordenadasDestino.y);
        List<Double> coords = new ArrayList<>();
        coords.add(coordenadasDestino.x);
        coords.add(coordenadasDestino.y);

        return coords;
    }



}
