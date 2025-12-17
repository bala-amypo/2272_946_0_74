package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {

    @Autowired
    StudentService ser;
    
    @PostMapping("/add_data")

    public Student createData(@RequestBody Student stu){
        return ser.createData(stu);
    }

    @GetMapping("/fetch_data")
    public List<Student> fetchRecord(){
        return ser.fetchRecord();
    }
    @GetMapping("/fetchbyid/{id}")
    public Optional<Student> fetchById(@PathVariable int id){
         return ser.fetchById(id);
    }
    @PutMapping("/update")
    public String updateData(@PathVariable int id,@RequestBody Student stu){
        stu.setId(id);
        ser.createdData(stu);
        return "Data updated";

    }
}
