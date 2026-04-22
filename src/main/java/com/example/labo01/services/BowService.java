package com.example.labo01.services;

import com.example.labo01.domain.model.Bow;
import com.example.labo01.repository.BowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BowService {

    private final BowRepository bowRepository;

    public List<Bow> getByVirusBase(String virusBase) {
        return bowRepository.findAll().stream()
                .filter(bow -> bow.getVirusBase().equalsIgnoreCase(virusBase))
                .toList();
    }

    public List<Bow> getByEstadoActual(String estadoActual) {
        return bowRepository.findAll().stream()
                .filter(bow -> bow.getEstadoActual().equalsIgnoreCase(estadoActual))
                .toList();
    }

    public List<String> getVirusActivosSinRepeticion() {
        return bowRepository.findAll().stream()
                .filter(bow -> bow.getEstadoActual().equalsIgnoreCase("En libertad"))
                .map(Bow::getVirusBase)
                .distinct()
                .toList();
    }
}