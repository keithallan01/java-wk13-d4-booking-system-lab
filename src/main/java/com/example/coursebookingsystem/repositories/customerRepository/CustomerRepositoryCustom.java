package com.example.coursebookingsystem.repositories.customerRepository;

import com.example.coursebookingsystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> getAllCustomersByCourseId(Long courseId);
}
