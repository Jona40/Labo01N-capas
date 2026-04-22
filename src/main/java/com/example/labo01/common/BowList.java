package com.example.labo01.common;

import com.example.labo01.domain.model.Bow;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BowList {

    private final List<Bow> bows;

    public BowList() {
        this.bows = new ArrayList<>();

        this.bows.add(Bow.builder()
                .nombre("Licker")
                .virusBase("T-Virus")
                .nivelPeligro(4)
                .puntoDebil("Cabeza")
                .estadoActual("En libertad")
                .ultimaUbicacion("Comisaría")
                .posibleOrigenUniversidad("Laboratorio de Biología")
                .build());

        this.bows.add(Bow.builder()
                .nombre("Hunter")
                .virusBase("T-Virus")
                .nivelPeligro(3)
                .puntoDebil("Cuello")
                .estadoActual("Contenido")
                .ultimaUbicacion("Mansión")
                .posibleOrigenUniversidad("Laboratorio de Química")
                .build());

        this.bows.add(Bow.builder()
                .nombre("Tyrant")
                .virusBase("T-Virus")
                .nivelPeligro(5)
                .puntoDebil("Corazón expuesto")
                .estadoActual("En libertad")
                .ultimaUbicacion("Laboratorio")
                .posibleOrigenUniversidad("Laboratorio de Anatomía")
                .build());

        this.bows.add(Bow.builder()
                .nombre("G-Birkin")
                .virusBase("G-Virus")
                .nivelPeligro(5)
                .puntoDebil("Ojos mutados")
                .estadoActual("En libertad")
                .ultimaUbicacion("Laboratorio")
                .posibleOrigenUniversidad("Laboratorio de Genética")
                .build());

        this.bows.add(Bow.builder()
                .nombre("Regenerador")
                .virusBase("Las Plagas")
                .nivelPeligro(4)
                .puntoDebil("Parásitos internos")
                .estadoActual("Contenido")
                .ultimaUbicacion("Pueblo")
                .posibleOrigenUniversidad("Laboratorio de Microbiología")
                .build());

        this.bows.add(Bow.builder()
                .nombre("Lady Dimitrescu")
                .virusBase("Cadou")
                .nivelPeligro(4)
                .puntoDebil("Corazón mutado")
                .estadoActual("Eliminado")
                .ultimaUbicacion("Pueblo")
                .posibleOrigenUniversidad("Laboratorio de Biotecnología")
                .build());

        this.bows.add(Bow.builder()
                .nombre("Moreau")
                .virusBase("Cadou")
                .nivelPeligro(3)
                .puntoDebil("Cuerpo principal")
                .estadoActual("En libertad")
                .ultimaUbicacion("Pueblo")
                .posibleOrigenUniversidad("Laboratorio de Zoología")
                .build());
    }

    public List<Bow> getBows() {
        return bows;
    }
}
