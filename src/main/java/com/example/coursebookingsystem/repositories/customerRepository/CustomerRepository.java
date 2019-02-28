package com.example.coursebookingsystem.repositories.customerRepository;

import com.example.coursebookingsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository  extends JpaRepository <Customer, Long>, CustomerRepositoryCustom {
    List<Customer> getAllCustomersByCourseId(Long courseId);
}


