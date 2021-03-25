package com.example.demo.entities.campo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CampoRepository extends CrudRepository<Campo, String> {

    public List<Campo> findByTopicId(String topicId);


}
