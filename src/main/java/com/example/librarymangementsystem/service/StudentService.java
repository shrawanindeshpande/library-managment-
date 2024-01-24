package com.example.librarymangementsystem.service;

import com.example.librarymangementsystem.entities.Student;
import com.example.librarymangementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public String addStudent(Student student){
        studentRepository.save(student);
        return "Student has been added to db";
    }

}
