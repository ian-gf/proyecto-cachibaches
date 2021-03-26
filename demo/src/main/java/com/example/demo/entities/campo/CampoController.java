package com.example.demo.entities.campo;

import com.example.demo.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CampoController {

    @Autowired
    private CampoService campoService;

    @RequestMapping("/campos")
    public List<Campo> getAllCampos() {
        return campoService.getAllCampos();
    }

    @RequestMapping("/campos/{id}")
    public Campo getCampo(@PathVariable String id) { return campoService.getCampo(id); }

    @RequestMapping(method = RequestMethod.POST, value = "/campos")
    public void addCampo(@RequestBody Campo campo) { campoService.addCampo(campo); }

    @RequestMapping(method = RequestMethod.PUT, value = "/campos/{id}")
    public void updateCampo(@RequestBody Campo campo, @PathVariable String id) { campoService.updateCampo(id, campo); }

    @RequestMapping(method = RequestMethod.DELETE, value = "/campos/{id}")
    public void deleteCampo(@PathVariable String id) {
        campoService.deleteCampo(id);
    }

}
