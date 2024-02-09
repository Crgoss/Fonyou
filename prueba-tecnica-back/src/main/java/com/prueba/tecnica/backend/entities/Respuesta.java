package com.prueba.tecnica.backend.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@Entity
@Table(name = "\"Respuesta\"", schema = "public")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String respuesta;
    private boolean correcta;
}
