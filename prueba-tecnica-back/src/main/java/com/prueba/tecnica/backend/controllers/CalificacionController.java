package com.prueba.tecnica.backend.controllers;

import com.prueba.tecnica.backend.dtos.EstudianteDTO;
import com.prueba.tecnica.backend.dtos.ExamenDTO;
import com.prueba.tecnica.backend.dtos.Response;
import com.prueba.tecnica.backend.entities.Respuesta;
import com.prueba.tecnica.backend.services.EstudianteService;
import com.prueba.tecnica.backend.services.ExamenService;
import com.prueba.tecnica.backend.servicesImpl.EstudianteServiceImpl;
import com.prueba.tecnica.backend.servicesImpl.ExamenServiceImpl;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CalificacionController {

    @Autowired
    private ExamenServiceImpl examenService;

    @Autowired
    private EstudianteServiceImpl estudianteService;

    @Autowired
    public CalificacionController(ExamenServiceImpl examenService, EstudianteServiceImpl estudianteService) {
        this.examenService = examenService;
        this.estudianteService = estudianteService;
    }



    @PostMapping("/crear")
    public ResponseEntity<?> crearExamen(@RequestBody ExamenDTO examen) {
        try {
            examenService.validarExamen(examen);
            ExamenDTO examenCreado = examenService.crearExamen(examen);
            return ResponseEntity.status(HttpStatus.CREATED).body(examenCreado);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }



    @RequestMapping(value="estudiantes",method = RequestMethod.POST)
    public ResponseEntity<?> crearEstudiante(@RequestBody EstudianteDTO estudiante) {
        Response estudianteCreado = estudianteService.crearEstudiante(estudiante);
        return ResponseEntity.status(HttpStatus.CREATED).body(estudianteCreado);
    }



    @GetMapping("/{examenId}/respuestas/{estudianteId}")
    public List<Respuesta> recopilarRespuestas(@PathVariable Long examenId, @PathVariable String estudianteId) {
        return examenService.obtenerRespuestasDeEstudiante(examenId, estudianteId);
    }


    @PostMapping("/{examenId}/calificar")
    public double calificarExamen(@PathVariable Long examenId) {
        return examenService.calificarExamen(examenId);
    }

}

