package com.aluracursos.screenmatch_frases.repository;

import com.aluracursos.screenmatch_frases.dto.FraseDTO;
import com.aluracursos.screenmatch_frases.principal.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase,Long>{
    @Query("SELECT f FROM Frase f ORDER BY FUNCTION('RANDOM') LIMIT 1")
    public Frase obtenerFraseAleatoria();
}
