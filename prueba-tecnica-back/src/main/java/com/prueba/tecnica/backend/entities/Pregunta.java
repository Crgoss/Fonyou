package com.prueba.tecnica.backend.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@Entity
@Table(name = "\"Pregunta\"", schema = "public")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String enunciado;
    private String opcionA;
    private String opcionB;
    private String opcionC;
    private String opcionD;
    private String opcionCorrecta;
    private int puntaje;

    @ManyToOne
    @JoinColumn(name = "examen_id", nullable = false)
    private Examen examen;


}

