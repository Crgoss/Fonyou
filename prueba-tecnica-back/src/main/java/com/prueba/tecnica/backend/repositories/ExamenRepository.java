package com.prueba.tecnica.backend.repositories;

import com.prueba.tecnica.backend.entities.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Long> {


    List<Examen> save(List<Examen> examenes);
}

