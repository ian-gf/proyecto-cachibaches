package com.example.demo.entities.campo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CampoService {

    @Autowired
    private CampoRepository campoRepository;

    public List<Campo> getAllCampos() {
        List<Campo> campos = new ArrayList<>();
        campoRepository.findAll().forEach(campos::add);
        return campos;

    }

    public Campo getCampo(String id) {
        return campoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id));
    }

    public void addCampo(Campo campo) {
        campoRepository.save(campo);

    }

    public void updateCampo(String id, Campo campo) {
        campoRepository.save(campo);

    }

    public void deleteCampo(String id) {
        campoRepository.deleteById(id);
    }
}
