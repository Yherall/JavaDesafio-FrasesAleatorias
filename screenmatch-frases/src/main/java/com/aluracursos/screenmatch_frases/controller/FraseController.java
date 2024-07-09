package com.aluracursos.screenmatch_frases.controller;

import com.aluracursos.screenmatch_frases.dto.FraseDTO;
import com.aluracursos.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    FraseService servicio;
    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }
}
