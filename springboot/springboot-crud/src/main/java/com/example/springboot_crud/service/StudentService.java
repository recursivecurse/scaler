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
        student.setDeleted(false);
        Student createdStudent = studentRepository.save(student);

        return createdStudent;
    }

    public List<Student> getAllStudents() {

        List<Student> studentList = studentRepository.findByDeletedIsFalse();

        return studentList;
    }

    public Student getStudent(Long id) {
        
        Optional<Student> student= studentRepository.findByIdAndDeletedIsFalse(id);

        return student.orElse(null);
    }

    public Student updateStudent(Long id, Student student) {
        Optional<Student> existing = studentRepository.findByIdAndDeletedIsFalse(id);
        if (existing.isEmpty()) {
            return null;
        }
        Student existingStudent = existing.get();
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setDepartment(student.getDepartment());
        existingStudent.setRollNo(student.getRollNo());
        existingStudent.setDeleted(false);
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

    public Boolean softDeleteStudent(Long id)
    {
        Optional<Student> existing = studentRepository.findByIdAndDeletedIsFalse(id);
        if (existing.isEmpty()) {
            return null;
        }
        Student existingStudent = existing.get();
        existingStudent.setDeleted(true);
        studentRepository.save(existingStudent);
        return true;
    }
}
