package com.example.labo01.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bow {
    private String nombre;
    private String virusBase;
    private int nivelPeligro;
    private String puntoDebil;
    private String estadoActual;
    private String ultimaUbicacion;
    private String posibleOrigenUniversidad;
}
