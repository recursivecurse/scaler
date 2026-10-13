package com.example.springboot_crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.springboot_crud.entity.Student;
import com.example.springboot_crud.repository.StudentRepository;

@Service 
public class StudentService {

    private StudentRepository studentRepository;

    StudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student)
    {
        Student createdStudent = studentRepository.save(student);

        return createdStudent;
    }

    public List<Student> getAllStudents() {

        List<Student> studentList = studentRepository.findAll();

        return studentList;
    }

    public Student getStudent(Long id) {
        
        Optional<Student> student= studentRepository.findById(id);

        return student.orElse(null);
    }

    public Student updateStudent(Long id, Student student) {
        Optional<Student> existing = studentRepository.findById(id);
        if (existing.isEmpty()) {
            return null;
        }
        Student existingStudent = existing.get();
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setDepartment(student.getDepartment());
        existingStudent.setRollNo(student.getRollNo());
        return studentRepository.save(existingStudent);
    }

    public Boolean deleteStudent(Long id) {
        
        Optional<Student> student = studentRepository.findById(id);
        if(student.isEmpty()) {
            return null;
        }

        studentRepository.delete(student.get());
        return true;
    }
}
