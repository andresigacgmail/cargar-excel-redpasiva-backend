package com.example.cargarregistrosredpasiva.service;

import com.example.cargarregistrosredpasiva.dto.PasivaDto;
import com.example.cargarregistrosredpasiva.repository.PasivaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasivaService {

    @Autowired private PasivaRepository pasivaRepository;

    public PasivaDto procesarPasiva(List<PasivaDto> pasivaDto){
        int estadoVertice = 0;
        int idMunicipio = 0;
        for(PasivaDto pasivaDto1 : pasivaDto){
            estadoVertice = pasivaDto1.getEstacionDto().getEstado_vertice().equals("Materializado")  ? 2 : 1;
            idMunicipio = pasivaRepository.findMunicipioByNombre(pasivaDto1.getEstacionDto().getMunicipio()).getT_id();

        }
        System.out.println("objeto" + pasivaDto.get(0).getEstacionDto());
        estadoVertice = pasivaDto.get(0).getEstacionDto().getEstado_vertice().equals("Materializado")  ? 2 : 1;
        System.out.println(pasivaRepository.findMunicipioByNombre(pasivaDto.get(0).getEstacionDto().getMunicipio()).getT_id());
        System.out.println(estadoVertice);
        System.out.println(pasivaDto.get(0).getEstacionDto().getEstado_vertice());
        return pasivaDto.get(0);
    }



}
