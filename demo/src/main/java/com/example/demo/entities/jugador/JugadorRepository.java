package com.example.demo.entities.jugador;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JugadorRepository extends CrudRepository<Jugador, String> {

    public List<Jugador> findByTopicId(String topicId);


}
