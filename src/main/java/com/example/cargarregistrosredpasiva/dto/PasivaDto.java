package com.example.cargarregistrosredpasiva.dto;

import com.example.cargarregistrosredpasiva.entity.Estacion;
import com.example.cargarregistrosredpasiva.entity.Materializacion;
import com.example.cargarregistrosredpasiva.entity.PuntosReferencia;

import java.util.ArrayList;
import java.util.List;

public class PasivaDto {

    private Estacion estacion;
    private Materializacion materializacion;
    private List<PuntosReferencia> puntosReferencia = new ArrayList<>();

    public Estacion getEstacion() {
        return estacion;
    }

    public void setEstacion(Estacion estacion) {
        this.estacion = estacion;
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
