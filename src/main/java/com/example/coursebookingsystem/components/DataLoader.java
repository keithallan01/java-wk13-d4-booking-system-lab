package com.example.coursebookingsystem.components;

import com.example.coursebookingsystem.models.Booking;
import com.example.coursebookingsystem.models.Course;
import com.example.coursebookingsystem.models.Customer;
import com.example.coursebookingsystem.repositories.bookingRepository.BookingRepository;
import com.example.coursebookingsystem.repositories.courseRepository.CourseRepository;
import com.example.coursebookingsystem.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader (){

    }

    public void run(ApplicationArguments args){
        Course course1 = new Course("German", "Duesseldorf", 4);
        courseRepository.save(course1);

        Course course2 = new Course("Spanish", "Malaga", 3);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Susan", "Falkirk", 23);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Frank", "Falkirk", 40);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("27.02.2019", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("20.03.2019", course2, customer1);
        bookingRepository.save(booking2);

    }
}
