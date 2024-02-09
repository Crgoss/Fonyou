package com.prueba.tecnica.backend.mappers;

import com.prueba.tecnica.backend.dtos.EstudianteDTO;
import com.prueba.tecnica.backend.entities.Estudiante;
import java.util.Objects;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-07T18:01:29-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class EstudianteMapperImpl implements EstudianteMapper {

    @Override
    public EstudianteDTO map(Estudiante source) {
        if ( source == null ) {
            return null;
        }

        EstudianteDTO estudianteDTO = new EstudianteDTO();

        estudianteDTO.setId( source.getId() );
        estudianteDTO.setNombre( source.getNombre() );
        estudianteDTO.setEdad( String.valueOf( source.getEdad() ) );
        estudianteDTO.setCiudad( source.getCiudad() );

        return estudianteDTO;
    }

    @Override
    public Estudiante map(EstudianteDTO source) {
        if ( source == null ) {
            return null;
        }

        Estudiante estudiante = new Estudiante();

        estudiante.setId( source.getId() );
        estudiante.setNombre( source.getNombre() );
        estudiante.setCiudad( source.getCiudad() );
        if ( source.getEdad() != null ) {
            estudiante.setEdad( Integer.parseInt( source.getEdad() ) );
        }

        return estudiante;
    }

    @Override
    public EstudianteDTO mapCreate(Estudiante source) {
        if ( source == null ) {
            return null;
        }

        EstudianteDTO estudianteDTO = new EstudianteDTO();

        estudianteDTO.setId( source.getId() );
        estudianteDTO.setNombre( source.getNombre() );
        estudianteDTO.setEdad( String.valueOf( source.getEdad() ) );
        estudianteDTO.setCiudad( source.getCiudad() );

        return estudianteDTO;
    }

    @Override
    public Estudiante mapCreate(EstudianteDTO source) {
        if ( source == null ) {
            return null;
        }

        Estudiante estudiante = new Estudiante();

        estudiante.setId( source.getId() );
        estudiante.setNombre( source.getNombre() );
        estudiante.setCiudad( source.getCiudad() );
        if ( source.getEdad() != null ) {
            estudiante.setEdad( Integer.parseInt( source.getEdad() ) );
        }

        return estudiante;
    }
}
