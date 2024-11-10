package com.nishi.studentsystem.controller;

import com.nishi.studentsystem.model.Student;
import com.nishi.studentsystem.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class studentcontroller {
    @Autowired
    private studentservice studentService;
    @PostMapping("/add")
    public String add(@RequestBody Student student)
    {
        studentService.saveStudent(student);
        return "New student is added";
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

}
