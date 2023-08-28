package com.example.cargarregistrosredpasiva.entity;

import javax.persistence.*;

@Entity
@Table(name = "estaciontipo")
public class EstacionTipo {

    public EstacionTipo() {
    }

    public EstacionTipo(int tipo, int estacion) {
        this.tipo = tipo;
        this.estacion = estacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int t_id;

    private int tipo;
    private int estacion;

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEstacion() {
        return estacion;
    }

    public void setEstacion(int estacion) {
        this.estacion = estacion;
    }
}
