package com.example.demo.entity;

import jakarta.persistence.*;

@Entity 
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String rollnumber;
    private int age;
    private float cgpa;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRollnumber() {
        return rollnumber;
    }
    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public Student(int id, String name, String rollnumber, int age, float cgpa) {
        this.id = id;
        this.name = name;
        this.rollnumber = rollnumber;
        this.age = age;
        this.cgpa = cgpa;
    }
    public Student() {
    }
    
}
