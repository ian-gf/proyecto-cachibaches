package com.example.demo.entities.campo;

import com.example.demo.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CampoController {

    @Autowired
    private CampoService campoService;

    @RequestMapping("/topics/{id}/campos")
    public List<Campo> getAllCourses(@PathVariable String id) {
        return campoService.getAllCampos(id);
    }

    @RequestMapping("/topics/{topicId}/campos/{id}")
    public Campo getCourse(@PathVariable String id) {
        return campoService.getCampo(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/campos")
    public void addCourse(@RequestBody Campo campo, @PathVariable String topicId) {
        campo.setTopic(new Topic(topicId, "", ""));
        campoService.addCampo(campo);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/campos/{id}")
    public void updateCourse(@RequestBody Campo campo, @PathVariable String topicId, @PathVariable String id) {
        campo.setTopic(new Topic(topicId, "", ""));
        campoService.updateCampo(campo);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/campos/{id}")
    public void deleteCampo(@PathVariable String id) {
        campoService.deleteCampo(id);
    }

}
