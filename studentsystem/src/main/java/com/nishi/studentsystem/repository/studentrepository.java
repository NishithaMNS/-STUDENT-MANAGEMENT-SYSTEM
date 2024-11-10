package com.nishi.studentsystem.repository;

import com.nishi.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentrepository extends JpaRepository<Student,Integer>{
}
