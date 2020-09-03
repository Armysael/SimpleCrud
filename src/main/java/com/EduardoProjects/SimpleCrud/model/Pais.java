package com.EduardoProjects.SimpleCrud.model;

import javax.persistence.*;

@Entity
public class Pais {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private String capital;

    public Pais() {
    }

    public Pais(int id, String name, String capital) {
        this.id = id;
        this.name = name;
        this.capital = capital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
