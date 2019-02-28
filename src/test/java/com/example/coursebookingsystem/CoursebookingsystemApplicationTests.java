package com.example.coursebookingsystem;

import com.example.coursebookingsystem.models.Course;
import com.example.coursebookingsystem.models.Customer;
import com.example.coursebookingsystem.repositories.courseRepository.CourseRepository;
import com.example.coursebookingsystem.repositories.customerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursebookingsystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindCourseByRating(){
		List<Course> found = courseRepository.findCourseByStarRating(4);
	}

	@Test
	public void getAllCustomersByCourseId(){
		List<Customer> found = customerRepository.getAllCustomersByCourseId(3L);
	}

}
