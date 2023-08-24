package com.example.cargarregistrosredpasiva.entity;

import javax.persistence.*;

@Entity
@Table(name = "main_estacion")
public class Estacion {

    public Estacion() {
    }

    public Estacion(String identificador, String nomenclatura, int municipio, double latitud, double longitud, double altura_elipsoidal, int estado_vertice, int agencia) {
        this.agencia = agencia;
        this.identificador = identificador;
        this.nomenclatura = nomenclatura;
        this.municipio = municipio;
        this.latitud = latitud;
        this.longitud = longitud;
        this.altura_elipsoidal = altura_elipsoidal;
        this.estado_vertice = estado_vertice;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int t_id;

    private String identificador;
    private String nomenclatura;
    private int municipio;
    private double latitud;
    private double longitud;
    private double altura_elipsoidal;
    private int estado_vertice;
    private int agencia;
    private String geom = "01010000A0A1240000702BEE301EC35241F8A8815EE6E742410000000000000000";


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getGeom() {
        return geom;
    }

    public void setGeom(String geom) {
        this.geom = geom;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNomenclatura() {
        return nomenclatura;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
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

    public int getEstado_vertice() {
        return estado_vertice;
    }

    public void setEstado_vertice(int estado_vertice) {
        this.estado_vertice = estado_vertice;
    }
}
