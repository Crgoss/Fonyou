package com.prueba.tecnica.backend.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import static com.prueba.tecnica.backend.utils.contants.SUCCESS_CODE;
import static com.prueba.tecnica.backend.utils.contants.SUCCESS_MESSAGE;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RespuestaDTO {

    private Long id;

    private String respuesta;
    private boolean correcta;
}
