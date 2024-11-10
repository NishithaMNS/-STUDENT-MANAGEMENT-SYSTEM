package com.nishi.studentsystem.service;

import com.nishi.studentsystem.model.Student;

import java.util.List;

public interface studentservice {
    public  Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
