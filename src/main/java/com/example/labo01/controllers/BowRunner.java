package com.example.labo01.controllers;

import com.example.labo01.domain.model.Bow;
import com.example.labo01.services.BowService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BowRunner implements CommandLineRunner {

    private final BowService bowService;

    @Override
    public void run(String... args) {
        System.out.println("=== FILTRADO POR VIRUS BASE: T-Virus ===");
        bowService.getByVirusBase("T-Virus")
                .forEach(this::printBow);

        System.out.println("\n=== FILTRADO POR ESTADO ACTUAL: En libertad ===");
        bowService.getByEstadoActual("En libertad")
                .forEach(this::printBow);

        System.out.println("\n=== VIRUS ACTIVOS SIN REPETICION ===");
        bowService.getVirusActivosSinRepeticion()
                .forEach(virus -> System.out.println("[S.T.A.R.S-REPORT] Virus Activo: " + virus));
    }

    private void printBow(Bow bow) {
        System.out.println("[S.T.A.R.S-REPORT] Nombre: " + bow.getNombre()
                + " | Nivel de Peligro: " + bow.getNivelPeligro()
                + " | Punto Débil: " + bow.getPuntoDebil());
    }
}
