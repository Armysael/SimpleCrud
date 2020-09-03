package com.EduardoProjects.SimpleCrud.utilsJson;

import com.EduardoProjects.SimpleCrud.model.Pais;

import java.io.Serializable;

public class PaisJson implements Serializable {

    public int id;
    public String nombre;
    public String capital;

    public PaisJson(){}

    public PaisJson(Pais pais) {
        this.id = pais.getId();
        this.nombre = pais.getName();
        this.capital = pais.getCapital();
    }
}
