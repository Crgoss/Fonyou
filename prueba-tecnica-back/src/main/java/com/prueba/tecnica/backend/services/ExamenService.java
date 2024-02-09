package com.prueba.tecnica.backend.services;

import com.prueba.tecnica.backend.dtos.ExamenDTO;
import com.prueba.tecnica.backend.entities.Respuesta;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import java.util.List;

public interface ExamenService {

    ExamenDTO crearExamen(ExamenDTO examen);
    void validarExamen(ExamenDTO examen);

    List<Respuesta> obtenerRespuestasDeEstudiante(Long examenId, String estudianteId);
    double calificarExamen(Long examenId);
}
