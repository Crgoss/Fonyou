package com.prueba.tecnica.backend.mappers;

import com.prueba.tecnica.backend.dtos.EstudianteDTO;
import com.prueba.tecnica.backend.dtos.ExamenDTO;
import com.prueba.tecnica.backend.entities.Estudiante;
import com.prueba.tecnica.backend.entities.Examen;
import com.prueba.tecnica.backend.entities.Pregunta;
import com.prueba.tecnica.backend.entities.Respuesta;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-07T18:01:29-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class ExamenMapperImpl implements ExamenMapper {

    @Override
    public ExamenDTO map(Examen source) {
        if ( source == null ) {
            return null;
        }

        ExamenDTO examenDTO = new ExamenDTO();

        examenDTO.setId( source.getId() );
        List<Pregunta> list = source.getPreguntas();
        if ( list != null ) {
            examenDTO.setPreguntas( new ArrayList<Pregunta>( list ) );
        }
        examenDTO.setPuntajeTotal( source.getPuntajeTotal() );
        examenDTO.setFechaExamen( source.getFechaExamen() );
        examenDTO.setEstudiante( estudianteToEstudianteDTO( source.getEstudiante() ) );
        List<Respuesta> list1 = source.getRespuesta_id();
        if ( list1 != null ) {
            examenDTO.setRespuesta_id( new ArrayList<Respuesta>( list1 ) );
        }

        return examenDTO;
    }

    @Override
    public Examen map(ExamenDTO source) {
        if ( source == null ) {
            return null;
        }

        Examen examen = new Examen();

        examen.setId( source.getId() );
        List<Pregunta> list = source.getPreguntas();
        if ( list != null ) {
            examen.setPreguntas( new ArrayList<Pregunta>( list ) );
        }
        examen.setPuntajeTotal( source.getPuntajeTotal() );
        examen.setFechaExamen( source.getFechaExamen() );
        examen.setEstudiante( estudianteDTOToEstudiante( source.getEstudiante() ) );
        List<Respuesta> list1 = source.getRespuesta_id();
        if ( list1 != null ) {
            examen.setRespuesta_id( new ArrayList<Respuesta>( list1 ) );
        }

        return examen;
    }

    @Override
    public ExamenDTO mapCreate(Examen source) {
        if ( source == null ) {
            return null;
        }

        ExamenDTO examenDTO = new ExamenDTO();

        examenDTO.setId( source.getId() );
        List<Pregunta> list = source.getPreguntas();
        if ( list != null ) {
            examenDTO.setPreguntas( new ArrayList<Pregunta>( list ) );
        }
        examenDTO.setPuntajeTotal( source.getPuntajeTotal() );
        examenDTO.setFechaExamen( source.getFechaExamen() );
        examenDTO.setEstudiante( estudianteToEstudianteDTO( source.getEstudiante() ) );
        List<Respuesta> list1 = source.getRespuesta_id();
        if ( list1 != null ) {
            examenDTO.setRespuesta_id( new ArrayList<Respuesta>( list1 ) );
        }

        return examenDTO;
    }

    @Override
    public Examen mapCreate(ExamenDTO source) {
        if ( source == null ) {
            return null;
        }

        Examen examen = new Examen();

        examen.setId( source.getId() );
        List<Pregunta> list = source.getPreguntas();
        if ( list != null ) {
            examen.setPreguntas( new ArrayList<Pregunta>( list ) );
        }
        examen.setPuntajeTotal( source.getPuntajeTotal() );
        examen.setFechaExamen( source.getFechaExamen() );
        examen.setEstudiante( estudianteDTOToEstudiante( source.getEstudiante() ) );
        List<Respuesta> list1 = source.getRespuesta_id();
        if ( list1 != null ) {
            examen.setRespuesta_id( new ArrayList<Respuesta>( list1 ) );
        }

        return examen;
    }

    protected EstudianteDTO estudianteToEstudianteDTO(Estudiante estudiante) {
        if ( estudiante == null ) {
            return null;
        }

        EstudianteDTO estudianteDTO = new EstudianteDTO();

        estudianteDTO.setId( estudiante.getId() );
        estudianteDTO.setNombre( estudiante.getNombre() );
        estudianteDTO.setEdad( String.valueOf( estudiante.getEdad() ) );
        estudianteDTO.setCiudad( estudiante.getCiudad() );

        return estudianteDTO;
    }

    protected Estudiante estudianteDTOToEstudiante(EstudianteDTO estudianteDTO) {
        if ( estudianteDTO == null ) {
            return null;
        }

        Estudiante estudiante = new Estudiante();

        estudiante.setId( estudianteDTO.getId() );
        estudiante.setNombre( estudianteDTO.getNombre() );
        if ( estudianteDTO.getEdad() != null ) {
            estudiante.setEdad( Integer.parseInt( estudianteDTO.getEdad() ) );
        }
        estudiante.setCiudad( estudianteDTO.getCiudad() );

        return estudiante;
    }
}
