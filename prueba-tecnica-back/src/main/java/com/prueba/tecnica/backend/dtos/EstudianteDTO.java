package com.prueba.tecnica.backend.dtos;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.ZoneId;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EstudianteDTO {

	private Long id;

	private String nombre;

	private String edad;

	private String ciudad;



	public EstudianteDTO() {

	}
}
