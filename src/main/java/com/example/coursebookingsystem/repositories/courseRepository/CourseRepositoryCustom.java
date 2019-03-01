package com.example.coursebookingsystem.repositories.courseRepository;

import com.example.coursebookingsystem.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getAllCoursesByCustomerId(Long id);
}
