package com.example.demo.entities.campo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;

    }

    public Course getCourse(String id) {
        return courseRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id));
    }

    public void addCourse(Course course) {
        courseRepository.save(course);

    }

    public void updateCourse(Course course) {
        courseRepository.save(course);

    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
