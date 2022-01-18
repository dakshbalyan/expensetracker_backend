package com.personal.expensetracker.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
public class User {
    @Id
    @Column(name = "pk_userIdx")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "name", nullable = false)
    private String userName;

    @Column(name = "age", nullable = false)
    private int userAge;

    @Column(name = "location", nullable = false)
    private String userLocation;

    @OneToOne(mappedBy = "user")
    private Account account;

}
