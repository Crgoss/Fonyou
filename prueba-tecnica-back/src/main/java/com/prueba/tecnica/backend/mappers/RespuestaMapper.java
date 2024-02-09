package com.prueba.tecnica.backend.mappers;


import com.prueba.tecnica.backend.dtos.RespuestaDTO;
import com.prueba.tecnica.backend.entities.Respuesta;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Objects;

@Mapper( imports = Objects.class )
public interface RespuestaMapper {

    RespuestaMapper INSTANCE = Mappers.getMapper(RespuestaMapper.class);


    RespuestaDTO map(Respuesta source);
    @InheritInverseConfiguration(name = "map")
    @Mapping(source = "id", target = "id")
    @Mapping(source = "respuesta", target = "respuesta")
    @Mapping(source = "correcta", target = "correcta")
    Respuesta
    map(RespuestaDTO source);


    RespuestaDTO mapCreate(Respuesta source);
    @InheritInverseConfiguration(name = "mapCreate")
    @Mapping(source = "id", target = "id")
    @Mapping(source = "respuesta", target = "respuesta")
    @Mapping(source = "correcta", target = "correcta")
    Respuesta mapCreate(RespuestaDTO source);
}

