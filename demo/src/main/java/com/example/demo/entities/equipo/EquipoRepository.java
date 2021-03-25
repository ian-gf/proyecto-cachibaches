package com.example.demo.entities.equipo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EquipoRepository extends CrudRepository<Equipo, String> {

    public List<Equipo> findByTopicId(String topicId);


}
