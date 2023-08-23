package com.example.cargarregistrosredpasiva.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PuntosReferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int t_id;

    private int azimut;
    private double distancia;
    private String objeto;

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public int getAzimut() {
        return azimut;
    }

    public void setAzimut(int azimut) {
        this.azimut = azimut;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }
}
