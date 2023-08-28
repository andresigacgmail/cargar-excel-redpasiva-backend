package com.example.cargarregistrosredpasiva.entity;

import javax.persistence.*;

@Entity
@Table(name = "puntoreferencia")
public class PuntosReferencia {

    public PuntosReferencia() {
    }

    public PuntosReferencia(int azimut, double distancia, String objeto, int estacion) {
        this.azimut = azimut;
        this.distancia = distancia;
        this.objeto = objeto;
        this.estacion = estacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int t_id;

    private int azimut;
    private double distancia;
    private String objeto;

    private int estacion;

    public int getEstacion() {
        return estacion;
    }

    public void setEstacion(int estacion) {
        this.estacion = estacion;
    }

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
