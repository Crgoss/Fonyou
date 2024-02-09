package com.prueba.tecnica.backend.dtos;

import lombok.Data;

import java.util.Map;

@Data
public class RespuestasExamen {
    private Map<Long, String> respuestas;
}

