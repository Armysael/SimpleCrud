package com.EduardoProjects.SimpleCrud.repository;

import com.EduardoProjects.SimpleCrud.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,String> {


}
