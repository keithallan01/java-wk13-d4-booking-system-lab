package com.example.coursebookingsystem.repositories;

import com.example.coursebookingsystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository <Course, Long> {
}
