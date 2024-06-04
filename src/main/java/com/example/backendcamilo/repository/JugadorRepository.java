package com.example.backendcamilo.repository;

import com.example.backendcamilo.model.JugadorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadorRepository extends JpaRepository<JugadorModel, Integer> {
}
