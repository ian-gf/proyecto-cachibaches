package com.example.demo.entities.jugador;

import com.example.demo.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    @RequestMapping("/equipos/{id}/jugador")
    public List<Jugador> getAllCourses(@PathVariable String id) {
        return jugadorService.getAllJugadores(id);
    }

    @RequestMapping("/equipo/{equipoId}/jugador/{id}")
    public Jugador getJugador(@PathVariable String id) {
        return jugadorService.getJugador(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/equipos/{equipoId}/jugadores")
    public void addJugador(@RequestBody Jugador jugador, @PathVariable String topicId) {
        jugador.setTopic(new Topic(topicId, "", ""));
        jugadorService.addJugador(jugador);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/equipos/{equipoId}/jugadores/{id}")
    public void updateJugador(@RequestBody Jugador jugador, @PathVariable String topicId, @PathVariable String id) {
        jugador.setTopic(new Topic(topicId, "", ""));
        jugadorService.updateJugador(jugador);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/equipos/{equipoId}/jugadores/{id}")
    public void deleteJugador(@PathVariable String id) {
        jugadorService.deleteJugador(id);
    }

}
