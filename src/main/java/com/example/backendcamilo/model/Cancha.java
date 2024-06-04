package com.example.backendcamilo.model;

import jakarta.persistence.*;

@Entity
public class Cancha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cancha;

    private String nombre;
    private float latitud;
    private float longitud;
    private int cantidad_jugadores;

}
