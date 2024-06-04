package com.example.backendcamilo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_equipo;

    @OneToOne
    private JugadorModel lider;

    @OneToMany(mappedBy = "equipo")
    private List<JugadorModel> jugadores;

    private int cantidad_jugadores;

}
