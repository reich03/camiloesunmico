package com.example.backendcamilo.controller;

import com.example.backendcamilo.model.JugadorModel;
import com.example.backendcamilo.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    @GetMapping
    public List<JugadorModel> getAllJugadores() {
        return jugadorRepository.findAll();
    }

    @PostMapping
    public JugadorModel createJugador(@RequestBody JugadorModel jugador) {
        return jugadorRepository.save(jugador);
    }

    @GetMapping("/{id}")
    public JugadorModel getJugadorById(@PathVariable Integer id) {
        return jugadorRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public JugadorModel updateJugador(@PathVariable Integer id, @RequestBody JugadorModel jugadorDetails) {
        JugadorModel jugador = jugadorRepository.findById(id).orElse(null);
        if (jugador != null) {
            jugador.setUsername(jugadorDetails.getUsername());
            jugador.setCorreo(jugadorDetails.getCorreo());
            jugador.setPassword(jugadorDetails.getPassword());
            jugador.setNombre(jugadorDetails.getNombre());
            jugador.setApellidos(jugadorDetails.getApellidos());
            jugador.setEdad(jugadorDetails.getEdad());
            jugador.setPosicion_juego(jugadorDetails.getPosicion_juego());
            jugador.setNivel(jugadorDetails.getNivel());
            jugador.setFoto_perfil(jugadorDetails.getFoto_perfil());
            return jugadorRepository.save(jugador);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteJugador(@PathVariable Integer id) {
        jugadorRepository.deleteById(id);
    }
}
