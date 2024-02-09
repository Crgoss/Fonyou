package com.prueba.tecnica.backend.servicesImpl;

import com.prueba.tecnica.backend.dtos.EstudianteDTO;
import com.prueba.tecnica.backend.dtos.Response;
import com.prueba.tecnica.backend.entities.Estudiante;
import com.prueba.tecnica.backend.mappers.EstudianteMapper;
import com.prueba.tecnica.backend.repositories.EstudianteRepository;
import com.prueba.tecnica.backend.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    EstudianteMapper estudianteMapper;

    @Autowired
    private EstudianteRepository estudianteRepository;


    @Override
    public Response crearEstudiante(EstudianteDTO estudianteDto) {
        Response response = new Response();
System.out.println("estudiantes"+estudianteDto);
        Estudiante estudiante = estudianteMapper.mapCreate(estudianteDto);
        estudiante = estudianteRepository.save(estudiante);
        response.setEstudiante( estudianteMapper.map(estudiante));
        return response;

    }


    @Override
    public Estudiante obtenerEstudiantePorId(Long id) {
        return estudianteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Estudiante no encontrado con ID: " + id));
    }

}

