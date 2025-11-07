package org.example.java4n_fa25_sd20302.service;

import org.example.java4n_fa25_sd20302.entity.Student;
import org.example.java4n_fa25_sd20302.repository.StudentRepository;

import java.util.List;

public class StudentService {

    private StudentRepository studentRepository = new StudentRepository();

    public List<Student> getStudents() {

        return studentRepository.getStudents();
    }
}
