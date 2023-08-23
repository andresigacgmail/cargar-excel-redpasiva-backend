package com.example.cargarregistrosredpasiva.dto;

import com.example.cargarregistrosredpasiva.entity.Estacion;
import com.example.cargarregistrosredpasiva.entity.Materializacion;
import com.example.cargarregistrosredpasiva.entity.PuntosReferencia;

import java.util.ArrayList;
import java.util.List;

public class PasivaDto {

    private EstacionDto estacionDto;
    private Materializacion materializacion;
    private List<PuntosReferencia> puntosReferencia = new ArrayList<>();


    public EstacionDto getEstacionDto() {
        return estacionDto;
    }

    public void setEstacionDto(EstacionDto estacionDto) {
        this.estacionDto = estacionDto;
    }

    public Materializacion getMaterializacion() {
        return materializacion;
    }

    public void setMaterializacion(Materializacion materializacion) {
        this.materializacion = materializacion;
    }

    public List<PuntosReferencia> getPuntosReferencia() {
        return puntosReferencia;
    }

    public void setPuntosReferencia(List<PuntosReferencia> puntosReferencia) {
        this.puntosReferencia = puntosReferencia;
    }
}
