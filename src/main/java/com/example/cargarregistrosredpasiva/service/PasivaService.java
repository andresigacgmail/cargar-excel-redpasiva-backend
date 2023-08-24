package com.example.cargarregistrosredpasiva.service;

import com.example.cargarregistrosredpasiva.dto.PasivaDto;
import com.example.cargarregistrosredpasiva.entity.Estacion;
import com.example.cargarregistrosredpasiva.repository.EstacionRepository;
import com.example.cargarregistrosredpasiva.repository.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasivaService {

    @Autowired private MunicipioRepository pasivaRepository;
    @Autowired private EstacionRepository estacionRepository;

    public PasivaDto procesarPasiva(List<PasivaDto> pasivaDto){
        int estadoVertice = 0;
        int idMunicipio = 0;
        for(PasivaDto pasivaDto1 : pasivaDto){
            estadoVertice = pasivaDto1.getEstacionDto().getEstado_vertice().equals("Materializado")  ? 2 : 1;
            idMunicipio = pasivaRepository.findMunicipioByNombre(pasivaDto1.getEstacionDto().getMunicipio()).getT_id();
            System.out.println("municipio id "+idMunicipio + "agencia "+ pasivaDto1.getEstacionDto().getAgencia());
            Estacion estacion = estacionRepository.saveEstacion(
                                                                pasivaDto1.getEstacionDto().getIdentificador(),
                                                                pasivaDto1.getEstacionDto().getNomenclatura(),
                    estadoVertice,
                    idMunicipio,
                    pasivaDto1.getEstacionDto().getLatitud(),
                    pasivaDto1.getEstacionDto().getLongitud(),
                    pasivaDto1.getEstacionDto().getAltura_elipsoidal(),
                                                                pasivaDto1.getEstacionDto().getAgencia()
                                                        );


            System.out.println("estacion guardada " + estacion.getT_id());
        }
        System.out.println("objeto" + pasivaDto.get(0).getEstacionDto());
        estadoVertice = pasivaDto.get(0).getEstacionDto().getEstado_vertice().equals("Materializado")  ? 2 : 1;
        System.out.println(pasivaRepository.findMunicipioByNombre(pasivaDto.get(0).getEstacionDto().getMunicipio()).getT_id());
        System.out.println(estadoVertice);
        System.out.println(pasivaDto.get(0).getEstacionDto().getEstado_vertice());
        return pasivaDto.get(0);
    }



}
