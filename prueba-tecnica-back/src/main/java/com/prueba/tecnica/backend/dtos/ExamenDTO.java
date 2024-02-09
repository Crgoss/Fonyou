package com.prueba.tecnica.backend.dtos;

import com.prueba.tecnica.backend.entities.Pregunta;
import com.prueba.tecnica.backend.entities.Respuesta;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
public class ExamenDTO {


    private Long id;

    private List<Pregunta> preguntas;

    private int puntajeTotal;

    private LocalDateTime fechaExamen;


    private EstudianteDTO estudiante;


    private List<Respuesta> respuesta_id;


}
