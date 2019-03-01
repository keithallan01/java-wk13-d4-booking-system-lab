package com.example.coursebookingsystem.repositories.courseRepository;

import com.example.coursebookingsystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository <Course, Long>,  CourseRepositoryCustom {


//    have rating
//     want List<Course>

    List<Course> findCourseByStarRating(int starRating);
    List<Course> getAllCoursesByCustomerId(Long id);

}
