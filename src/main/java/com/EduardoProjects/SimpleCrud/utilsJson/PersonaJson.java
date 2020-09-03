package com.EduardoProjects.SimpleCrud.utilsJson;

import com.EduardoProjects.SimpleCrud.model.Persona;

import java.io.Serializable;

public class PersonaJson implements Serializable {

    public int id;
    public String nombre;
    public String apellido;

    public PersonaJson(){}

    public PersonaJson(Persona persona) {
        this.id = persona.getId();
        this.nombre = persona.getFirstname();
        this.apellido = persona.getLastname();
    }
}
