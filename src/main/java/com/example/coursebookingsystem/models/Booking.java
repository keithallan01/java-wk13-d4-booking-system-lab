package com.example.coursebookingsystem.models;


import javax.persistence.*;


@Entity
@Table(name="bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course

    public Booking(Long id, String date) {
        this.id = id;
        this.date = date;
    }

    public Booking() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
