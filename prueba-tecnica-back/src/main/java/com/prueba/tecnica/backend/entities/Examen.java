package com.prueba.tecnica.backend.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "\"Examen\"", schema = "public")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "examen", cascade = CascadeType.ALL)
    private List<Pregunta> preguntas;

    private int puntajeTotal;

    private LocalDateTime fechaExamen;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    @OneToMany
    @JoinColumn(name = "respuesta_id")
    private List<Respuesta> respuesta_id;
}

