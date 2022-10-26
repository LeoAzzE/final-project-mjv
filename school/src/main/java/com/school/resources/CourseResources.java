package com.school.resources;

import com.school.entities.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/courses")
public class CourseResources {

    @GetMapping
    public ResponseEntity<Course> findAll() {
        Course c1 = new Course(1L, "Leo", 500, 770.0, 7.0, 10.0);
        return ResponseEntity.ok().body(c1);
    }
}
