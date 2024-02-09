package com.prueba.tecnica.backend.mappers;

import com.prueba.tecnica.backend.dtos.RespuestaDTO;
import com.prueba.tecnica.backend.entities.Respuesta;
import java.util.Objects;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-07T18:01:29-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class RespuestaMapperImpl implements RespuestaMapper {

    @Override
    public RespuestaDTO map(Respuesta source) {
        if ( source == null ) {
            return null;
        }

        Long id = null;
        String respuesta = null;
        boolean correcta = false;

        id = source.getId();
        respuesta = source.getRespuesta();
        correcta = source.isCorrecta();

        RespuestaDTO respuestaDTO = new RespuestaDTO( id, respuesta, correcta );

        return respuestaDTO;
    }

    @Override
    public Respuesta map(RespuestaDTO source) {
        if ( source == null ) {
            return null;
        }

        Respuesta respuesta = new Respuesta();

        respuesta.setId( source.getId() );
        respuesta.setRespuesta( source.getRespuesta() );
        respuesta.setCorrecta( source.isCorrecta() );

        return respuesta;
    }

    @Override
    public RespuestaDTO mapCreate(Respuesta source) {
        if ( source == null ) {
            return null;
        }

        Long id = null;
        String respuesta = null;
        boolean correcta = false;

        id = source.getId();
        respuesta = source.getRespuesta();
        correcta = source.isCorrecta();

        RespuestaDTO respuestaDTO = new RespuestaDTO( id, respuesta, correcta );

        return respuestaDTO;
    }

    @Override
    public Respuesta mapCreate(RespuestaDTO source) {
        if ( source == null ) {
            return null;
        }

        Respuesta respuesta = new Respuesta();

        respuesta.setId( source.getId() );
        respuesta.setRespuesta( source.getRespuesta() );
        respuesta.setCorrecta( source.isCorrecta() );

        return respuesta;
    }
}
