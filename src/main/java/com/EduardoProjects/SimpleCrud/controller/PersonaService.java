package com.EduardoProjects.SimpleCrud.controller;

import com.EduardoProjects.SimpleCrud.model.Persona;
import com.EduardoProjects.SimpleCrud.repository.PersonaRepository;
import com.EduardoProjects.SimpleCrud.utilsJson.PersonaJson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaService {

    private final PersonaRepository repository;
    private static Logger logger = LoggerFactory.getLogger(PersonaService.class);
    public PersonaService(PersonaRepository personaRepository){

        this.repository = personaRepository;
    }

    @CrossOrigin
    @GetMapping("/listarPersonas")
    public List<PersonaJson> listarPersonas(){
        List<PersonaJson> listaPersonas = new ArrayList<>();

        try {
            List<Persona> personas = this.repository.findAll();

            personas.forEach(persona -> listaPersonas.add(new PersonaJson(persona)));
            return listaPersonas;

        }catch(Exception e){
            logger.error("ERROR: "+e.getMessage());
            return listaPersonas;
        }

    }
}
