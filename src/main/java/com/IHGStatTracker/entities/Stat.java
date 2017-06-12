package com.IHGStatTracker.entities;

import javax.persistence.*;

/**
 * Created by ericweidman on 6/11/17.
 */

@Entity
@Table(name = "stats")
public class Stat {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="booked")
    private int didBook;

    @Column(name="confirm")
    private int confirmationNumber;

    @Column(name="total")
    private double total;

    @Column(name="nights")
    private int numberOfNights;

    @Column(name="enrollments")
    private boolean enrollment;

    @Column(name="HCV")
    private int HCV;

    @Column(name="hertz")
    private int hertz;

    @Column(name="chase")
    private int chase;
}
