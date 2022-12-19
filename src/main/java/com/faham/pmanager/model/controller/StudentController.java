package com.faham.pmanager.model.controller;

import com.faham.pmanager.repository.StudentRepository;

public class StudentController {
    public final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

}
