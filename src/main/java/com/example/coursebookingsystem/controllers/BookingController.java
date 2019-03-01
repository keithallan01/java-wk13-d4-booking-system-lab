package com.example.coursebookingsystem.controllers;

import com.example.coursebookingsystem.models.Booking;
import com.example.coursebookingsystem.models.Course;
import com.example.coursebookingsystem.repositories.bookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/rating/{date}")
    public List<Booking> getBookingByDate(@PathVariable String date){
        return bookingRepository.getBookingByDate(date);
    }
}
