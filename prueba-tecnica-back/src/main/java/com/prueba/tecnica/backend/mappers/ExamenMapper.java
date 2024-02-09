package com.prueba.tecnica.backend.mappers;


import com.prueba.tecnica.backend.dtos.ExamenDTO;
import com.prueba.tecnica.backend.entities.Examen;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


import java.util.Objects;

@Mapper( imports = Objects.class )
public interface ExamenMapper {

    ExamenMapper INSTANCE = Mappers.getMapper(ExamenMapper.class);


    ExamenDTO map(Examen source);

    @InheritInverseConfiguration(name = "map")
    @Mapping(source = "id", target = "id")
    @Mapping(source = "preguntas", target = "preguntas")
    @Mapping(source = "puntajeTotal", target = "puntajeTotal")
    @Mapping(source = "fechaExamen", target = "fechaExamen")
    @Mapping(source = "estudiante", target = "estudiante")
    @Mapping(source = "respuesta_id", target = "respuesta_id")
    Examen
    map(ExamenDTO source);


    ExamenDTO mapCreate(Examen source);

    @InheritInverseConfiguration(name = "mapCreate")
    @Mapping(source = "id", target = "id")
    @Mapping(source = "preguntas", target = "preguntas")
    @Mapping(source = "puntajeTotal", target = "puntajeTotal")
    @Mapping(source = "fechaExamen", target = "fechaExamen")
    @Mapping(source = "estudiante", target = "estudiante")
    @Mapping(source = "respuesta_id", target = "respuesta_id")
    Examen mapCreate(ExamenDTO source);

}