package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@Service 
public class StudentService {

    private StudentRepository studentRepository;

    StudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    public Boolean createStudent(Student student)
    {
        studentRepository.saveStudent(student);
        return true;
    }

    public Student getStudent(Long id)
    {
        return studentRepository.getStudent(id);
    }

    public List<Student> getAllStudents()
    {
        return studentRepository.getAll();
    }

}
