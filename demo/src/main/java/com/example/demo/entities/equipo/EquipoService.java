package com.example.demo.entities.equipo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public List<Equipo> getAllEquipos(String topicId) {
        List<Equipo> equipos = new ArrayList<>();
        equipoRepository.findByTopicId(topicId).forEach(equipos::add);
        return equipos;

    }

    public Equipo getEquipo(String id) {
        return equipoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id));
    }

    public void addEquipo(Equipo equipo) {
        equipoRepository.save(equipo);

    }

    public void updateEquipo(Equipo equipo) {
        equipoRepository.save(equipo);

    }

    public void deleteEquipo(String id) {
        equipoRepository.deleteById(id);
    }
}
