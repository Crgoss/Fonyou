package com.prueba.tecnica.backend.repositories;

import com.prueba.tecnica.backend.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    Estudiante getEstudianteById(Long id);
}

