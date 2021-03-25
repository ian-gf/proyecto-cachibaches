package com.example.demo.entities.jugador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public List<Jugador> getAllJugadores(String topicId) {
        List<Jugador> jugadores = new ArrayList<>();
        jugadorRepository.findByTopicId(topicId).forEach(jugadores::add);
        return jugadores;

    }

    public Jugador getJugador(String id) {
        return jugadorRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id));
    }

    public void addJugador(Jugador jugador) {
        jugadorRepository.save(jugador);

    }

    public void updateJugador(Jugador jugador) {
        jugadorRepository.save(jugador);

    }

    public void deleteJugador(String id) {
        jugadorRepository.deleteById(id);
    }
}
