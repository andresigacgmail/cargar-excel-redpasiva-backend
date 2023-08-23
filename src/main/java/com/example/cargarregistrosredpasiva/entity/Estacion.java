package com.example.cargarregistrosredpasiva.entity;

import javax.persistence.*;

@Entity
@Table(name = "main_estacion")
public class Estacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int t_id;

    private int identificador;
    private String nomenclatura;
    private String municipio;
    private double latitud;
    private double longitud;
    private double altura_elipsoidal;
    private String estado_vertice;

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNomenclatura() {
        return nomenclatura;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAltura_elipsoidal() {
        return altura_elipsoidal;
    }

    public void setAltura_elipsoidal(double altura_elipsoidal) {
        this.altura_elipsoidal = altura_elipsoidal;
    }

    public String getEstado_vertice() {
        return estado_vertice;
    }

    public void setEstado_vertice(String estado_vertice) {
        this.estado_vertice = estado_vertice;
    }
}
