package com.example.cargarregistrosredpasiva.dto;

import com.example.cargarregistrosredpasiva.entity.Estacion;
import com.example.cargarregistrosredpasiva.entity.Materializacion;
import com.example.cargarregistrosredpasiva.entity.PuntosReferencia;

import java.util.ArrayList;
import java.util.List;

public class PasivaDto {

    private EstacionDto estacionDto;
    private MaterializacionDto materializacionDto;
    private List<PuntosReferencia> puntosReferencia = new ArrayList<>();


    public EstacionDto getEstacionDto() {
        return estacionDto;
    }

    public void setEstacionDto(EstacionDto estacionDto) {
        this.estacionDto = estacionDto;
    }

    public MaterializacionDto getMaterializacionDto() {
        return materializacionDto;
    }

    public void setMaterializacionDto(MaterializacionDto materializacionDto) {
        this.materializacionDto = materializacionDto;
    }

    public List<PuntosReferencia> getPuntosReferencia() {
        return puntosReferencia;
    }

    public void setPuntosReferencia(List<PuntosReferencia> puntosReferencia) {
        this.puntosReferencia = puntosReferencia;
    }
}
