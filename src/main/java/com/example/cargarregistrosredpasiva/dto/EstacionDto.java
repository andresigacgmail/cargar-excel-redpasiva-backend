package com.example.cargarregistrosredpasiva.dto;

public class EstacionDto {

    private String identificador;
    private String nomenclatura;
    private String municipio;
    private double latitud;
    private double longitud;
    private double altura_elipsoidal;
    private String estado_vertice;
    private int agencia;
//    private String geom;


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
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
