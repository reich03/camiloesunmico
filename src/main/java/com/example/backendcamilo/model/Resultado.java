package com.example.backendcamilo.model;

import jakarta.persistence.*;


@Entity
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_resultado;

    @OneToOne
    private Partido partido;

    private int[] goles;

}
