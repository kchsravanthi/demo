package com.example.demo.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Department {

    private String departName;

    @Id
    @GeneratedValue
    private Long id;

   @OneToMany
   @JoinColumn(name="depatmentNo")
    private List<Employee> employees;




}
