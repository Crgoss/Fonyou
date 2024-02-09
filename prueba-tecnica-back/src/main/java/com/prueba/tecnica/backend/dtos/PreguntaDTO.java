package com.prueba.tecnica.backend.dtos;


import lombok.Data;



@Data
public class PreguntaDTO {


    private Long id;
    private String enunciado;
    private String opcionA;
    private String opcionB;
    private String opcionC;
    private String opcionD;
    private String opcionCorrecta;
    private int puntaje;

    private ExamenDTO examen;
}
