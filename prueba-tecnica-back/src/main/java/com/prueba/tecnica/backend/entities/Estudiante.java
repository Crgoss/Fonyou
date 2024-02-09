package com.prueba.tecnica.backend.entities;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZoneId;


@Data
@Entity
@Table(name = "\"Estudiante\"", schema = "public")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private int edad;
    @Column(name = "ciudad")
    private String ciudad;

   // @Column(name = "zonaHoraria" )
   // private ZoneId zonaHoraria;


}

