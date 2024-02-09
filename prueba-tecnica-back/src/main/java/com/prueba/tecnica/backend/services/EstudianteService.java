package com.prueba.tecnica.backend.services;

import com.prueba.tecnica.backend.dtos.EstudianteDTO;
import com.prueba.tecnica.backend.dtos.Response;
import com.prueba.tecnica.backend.dtos.RespuestasExamen;
import com.prueba.tecnica.backend.entities.Estudiante;

import java.util.List;

public interface EstudianteService {
    Response crearEstudiante(EstudianteDTO estudiante);
    Estudiante obtenerEstudiantePorId(Long id);

}

