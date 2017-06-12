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

    @Column
    private int confirmationNumber;

    @Column
    private double total;

    @Column
    private int numberOfNights;

}
