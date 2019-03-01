package com.example.coursebookingsystem.repositories.customerRepository;

import com.example.coursebookingsystem.models.Course;
import com.example.coursebookingsystem.models.Customer;
import org.apache.catalina.Cluster;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;



public class CustomerRepositoryImpl {

    @Autowired
    EntityManager entityManager;

    //have: course
    //want: customers

    @Transactional
    public List<Customer> getAllCustomersByCourseId(Long courseId){
        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.createAlias("bookingAlias.course_id", "courseAlias");
            cr.add(Restrictions.eq("courseAlias.name", courseId));
            result = cr.list();
        }catch (HibernateException ex){
            ex.printStackTrace();
        }
                return result;

    }
}
