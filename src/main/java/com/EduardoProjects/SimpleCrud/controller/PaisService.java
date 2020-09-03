package com.EduardoProjects.SimpleCrud.controller;

import com.EduardoProjects.SimpleCrud.model.Pais;
import com.EduardoProjects.SimpleCrud.repository.PaisRepository;
import com.EduardoProjects.SimpleCrud.utilsJson.PaisJson;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PaisService {

    private PaisRepository repository;

    public PaisService(PaisRepository repository){

        this.repository = repository;
    }

    @CrossOrigin
    @GetMapping("/listarPaises")
    public List<PaisJson> listarPersonas(){
        List<PaisJson> paisJsons = new ArrayList<>();

        List<Pais> paises = this.repository.findAll();

        paises.forEach(pais -> paisJsons.add(new PaisJson(pais)));

        return paisJsons;
    }
}
