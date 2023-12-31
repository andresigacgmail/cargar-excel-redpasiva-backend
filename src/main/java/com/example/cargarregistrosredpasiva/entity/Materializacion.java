package com.example.cargarregistrosredpasiva.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "materializacion")
public class Materializacion {

    public Materializacion() {
    }

    public Materializacion(String lugar_materializacion, int tipo_materializacion, Date fecha_materializacion, Date fecha_descripcion, String monumentado_por_1, double ancho_mts, double largo_mts, double altura_mts, String observacion, String actualizó, String descripción_detallada, String acceso_general, String registrado_por, int estacion) {
        this.lugar_materializacion = lugar_materializacion;
        this.tipo_materializacion = tipo_materializacion;
        this.fecha_materializacion = fecha_materializacion;
        this.fecha_descripcion = fecha_descripcion;
        this.monumentado_por_1 = monumentado_por_1;
        this.ancho_mts = ancho_mts;
        this.largo_mts = largo_mts;
        this.altura_mts = altura_mts;
        this.observacion = observacion;
        this.actualizó = actualizó;
        this.descripción_detallada = descripción_detallada;
        this.acceso_general = acceso_general;
        this.registrado_por = registrado_por;
        this.estacion = estacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int t_id;

    private String lugar_materializacion;
    private int tipo_materializacion;
    private Date fecha_materializacion;
    private Date fecha_descripcion;
    private String monumentado_por_1;
    private double ancho_mts;
    private double largo_mts;
    private double altura_mts;
    private String observacion;
    private String actualizó;
    private String descripción_detallada;
    private String acceso_general;
    private String registrado_por;
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

    public String getLugar_materializacion() {
        return lugar_materializacion;
    }

    public void setLugar_materializacion(String lugar_materializacion) {
        this.lugar_materializacion = lugar_materializacion;
    }

    public int getTipo_materializacion() {
        return tipo_materializacion;
    }

    public void setTipo_materializacion(int tipo_materializacion) {
        this.tipo_materializacion = tipo_materializacion;
    }

    public Date getFecha_materializacion() {
        return fecha_materializacion;
    }

    public void setFecha_materializacion(Date fecha_materializacion) {
        this.fecha_materializacion = fecha_materializacion;
    }

    public Date getFecha_descripcion() {
        return fecha_descripcion;
    }

    public void setFecha_descripcion(Date fecha_descripcion) {
        this.fecha_descripcion = fecha_descripcion;
    }

    public String getMonumentado_por_1() {
        return monumentado_por_1;
    }

    public void setMonumentado_por_1(String monumentado_por_1) {
        this.monumentado_por_1 = monumentado_por_1;
    }

    public double getAncho_mts() {
        return ancho_mts;
    }

    public void setAncho_mts(double ancho_mts) {
        this.ancho_mts = ancho_mts;
    }

    public double getLargo_mts() {
        return largo_mts;
    }

    public void setLargo_mts(double largo_mts) {
        this.largo_mts = largo_mts;
    }

    public double getAltura_mts() {
        return altura_mts;
    }

    public void setAltura_mts(double altura_mts) {
        this.altura_mts = altura_mts;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getActualizó() {
        return actualizó;
    }

    public void setActualizó(String actualizó) {
        this.actualizó = actualizó;
    }

    public String getDescripción_detallada() {
        return descripción_detallada;
    }

    public void setDescripción_detallada(String descripción_detallada) {
        this.descripción_detallada = descripción_detallada;
    }

    public String getAcceso_general() {
        return acceso_general;
    }

    public void setAcceso_general(String acceso_general) {
        this.acceso_general = acceso_general;
    }

    public String getRegistrado_por() {
        return registrado_por;
    }

    public void setRegistrado_por(String registrado_por) {
        this.registrado_por = registrado_por;
    }
}
