package com.example.hellorest.employee;

import javax.persistence.*;

@Entity
//map another table  name
//@Table(name = "t_emp")
public class Employee {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

//    @Column(name = "fname")
    private String firstName;

//    @Column(name = "lname")
    private String lastName;

    public Employee() {
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
