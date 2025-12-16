package com.example.demo.entity;
import jakarta.persistence.*;


@Entity
public class Student{
    @id
    private int id;
    private String name;
    private String email;
    private float cgpa;
    public int getId(){
        return id;
    }
    public int setId(){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public String  setName(){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public String setEmail(){
        this.email=email;

    }
    public float getCgpa(){
        return cgpa;
    }
    public flaot setCgpa(){
        this.cgpa=cgpa;
    }
    public student(int id,String name,String email,float cgpa){
        this.id=id;
        this.name=name;
        this.email=email;
        this.cgpa=cgpa;
    }
    public Student(){
        
    }

}