package com.example.cargarregistrosredpasiva.entity;

import javax.persistence.*;

@Entity
@Table(name = "d_materializaciontipo")
public class MaterializacionTipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int t_id;

    private int itfcode;
    private String ilicode;
    private boolean inactive;
    private String dispname;
    private String description;

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public int getItfcode() {
        return itfcode;
    }

    public void setItfcode(int itfcode) {
        this.itfcode = itfcode;
    }

    public String getIlicode() {
        return ilicode;
    }

    public void setIlicode(String ilicode) {
        this.ilicode = ilicode;
    }

    public boolean isInactive() {
        return inactive;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }

    public String getDispname() {
        return dispname;
    }

    public void setDispname(String dispname) {
        this.dispname = dispname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
