package com.prueba.tecnica.backend.servicesImpl;


import com.prueba.tecnica.backend.dtos.ExamenDTO;
import com.prueba.tecnica.backend.dtos.RespuestaDTO;
import com.prueba.tecnica.backend.entities.Estudiante;
import com.prueba.tecnica.backend.entities.Examen;
import com.prueba.tecnica.backend.entities.Pregunta;
import com.prueba.tecnica.backend.entities.Respuesta;
import com.prueba.tecnica.backend.mappers.EstudianteMapper;
import com.prueba.tecnica.backend.mappers.ExamenMapper;
import com.prueba.tecnica.backend.repositories.EstudianteRepository;
import com.prueba.tecnica.backend.repositories.ExamenRepository;
import com.prueba.tecnica.backend.services.ExamenService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@Data
@Service
public class ExamenServiceImpl implements ExamenService {

    @Autowired
    ExamenMapper examenMapper;

    @Autowired
    EstudianteMapper estudianteMapper;

    @Autowired
    private ExamenRepository examenRepository;


    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public ExamenDTO crearExamen(ExamenDTO examenDto) {
        Examen examen = examenMapper.mapCreate(examenDto);
        examen = examenRepository.save(examen);
        return  examenMapper.map(examen);
    }

    public void validarExamen(ExamenDTO examen) {
        int sumaPuntajes = examen.getPreguntas().stream()
                .mapToInt(Pregunta::getPuntaje).sum();
        if (sumaPuntajes != 100) {
            throw new IllegalArgumentException("La suma de los puntajes de las preguntas debe ser 100");
        }
    }


    @Override
    public double calificarExamen(Long examenId) {

        Examen examen = examenRepository.findById(examenId).orElse(null);
        if (examen == null) {
            throw new IllegalArgumentException("No se encontró ningún examen con ID " + examenId);
        }

        double calificacion = 0.0;
        for (Respuesta respuesta : examen.getRespuesta_id()) {
            calificacion += evaluarRespuesta(respuesta);
        }

        return calificacion;

    }



    private void ajustarFechaExamen(ExamenDTO examen) {
        LocalDateTime fechaExamenBogota = examen.getFechaExamen();
        LocalDateTime fechaExamenEstudiante = fechaExamenBogota.atZone(ZoneId.of("America/Bogota")).toLocalDateTime();
        examen.setFechaExamen(fechaExamenEstudiante);
    }

@Override
    public List<Respuesta> obtenerRespuestasDeEstudiante(Long examenId, String estudianteId) {

    Examen examen = examenRepository.findById(examenId).orElse(null);
        Estudiante estudiante = examen.getEstudiante();

        if (estudiante != null && estudiante.getId().equals(estudianteId)) {
            return examen.getRespuesta_id();
        } else {
            throw new IllegalArgumentException("El estudiante con ID " + estudianteId + " no tiene respuestas en el examen con ID " + examenId);
        }
    }

    private double calcularCalificacion(Examen examen) {
        double calificacion = 0.0;
        for (Respuesta respuesta : examen.getRespuesta_id()) {
        }
        return calificacion;
    }

    private double evaluarRespuesta(Respuesta respuesta) {
        if (respuesta.isCorrecta()) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

}
