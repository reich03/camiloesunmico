package com.example.backendcamilo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_partido;

    @ManyToMany
    private List<Equipo> equipos;

    @ManyToOne
    private Cancha cancha;

    private String fecha;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
