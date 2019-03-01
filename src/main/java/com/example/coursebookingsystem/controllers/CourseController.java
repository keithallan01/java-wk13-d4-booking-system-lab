package com.example.coursebookingsystem.controllers;


import com.example.coursebookingsystem.models.Course;
import com.example.coursebookingsystem.repositories.courseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{starRating}")
    public List<Course> getCourseByStarRating(@PathVariable int starRating){
        return courseRepository.findCourseByStarRating(starRating);
    }

    @GetMapping(value = "/customer/{id}")
    public List<Course> getAllCoursesByCustomerId(@PathVariable Long id){
        return  courseRepository.getAllCoursesByCustomerId(id);
    }


}
