package com.prueba.tecnica.backend.mappers;

import com.prueba.tecnica.backend.dtos.EstudianteDTO;
import com.prueba.tecnica.backend.entities.Estudiante;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import sun.font.CompositeFont;

import java.util.Objects;

@Mapper( imports = Objects.class )
public interface EstudianteMapper {

    EstudianteMapper INSTANCE = Mappers.getMapper(EstudianteMapper.class);


    EstudianteDTO map(Estudiante source);
    @InheritInverseConfiguration(name = "map")
    @Mapping(source= "id", target= "id")
    @Mapping(source= "nombre", target= "nombre")
    @Mapping(source= "ciudad", target= "ciudad")
    Estudiante
    map(EstudianteDTO source);


    EstudianteDTO mapCreate(Estudiante source);
    @InheritInverseConfiguration(name = "mapCreate")
    @Mapping(source= "id", target= "id")
    @Mapping(source= "nombre", target= "nombre")
    @Mapping(source= "ciudad", target= "ciudad")
    Estudiante mapCreate(EstudianteDTO source);

}
