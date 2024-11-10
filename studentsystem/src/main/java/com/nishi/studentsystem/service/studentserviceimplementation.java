package com.nishi.studentsystem.service;

import com.nishi.studentsystem.model.Student;
import com.nishi.studentsystem.repository.studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentserviceimplementation implements studentservice{
    @Autowired
    private studentrepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
