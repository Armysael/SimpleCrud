package com.EduardoProjects.SimpleCrud.repository;

import com.EduardoProjects.SimpleCrud.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PaisRepository extends JpaRepository<Pais,String> {



}
