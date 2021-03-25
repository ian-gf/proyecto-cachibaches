package com.example.demo.entities.equipo;

import com.example.demo.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @RequestMapping("/topics/{id}/equipo")
    public List<Equipo> getAllCourses(@PathVariable String id) {
        return equipoService.getAllEquipos(id);
    }

    @RequestMapping("/topics/{topicId}/equipo/{id}")
    public Equipo getEquipo(@PathVariable String id) {
        return equipoService.getEquipo(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/equipo")
    public void addEquipo(@RequestBody Equipo equipo, @PathVariable String topicId) {
        equipo.setTopic(new Topic(topicId, "", ""));
        equipoService.addEquipo(equipo);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/equipo/{id}")
    public void updateEquipo(@RequestBody Equipo equipo, @PathVariable String topicId, @PathVariable String id) {
        equipo.setTopic(new Topic(topicId, "", ""));
        equipoService.updateEquipo(equipo);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/equipo/{id}")
    public void deleteEquipo(@PathVariable String id) {
        equipoService.deleteEquipo(id);
    }

}
