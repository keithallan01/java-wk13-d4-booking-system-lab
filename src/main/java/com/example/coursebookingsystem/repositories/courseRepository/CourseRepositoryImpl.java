package com.example.coursebookingsystem.repositories.courseRepository;

import com.example.coursebookingsystem.models.Booking;
import com.example.coursebookingsystem.models.Course;
import com.example.coursebookingsystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl {


    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> getAllCoursesByCustomerId(Long id){
        List<Course> result = null;
        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.createAlias("bookingAlias.customer", "customerAlias");
            cr.add(Restrictions.eq("customerAlias.id", id));
            result = cr.list();
        }catch (HibernateException ex){
            ex.printStackTrace();
        }
        return result;

    }
}
