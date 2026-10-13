package com.example.springboot_crud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_crud.entity.Student;
import com.example.springboot_crud.service.StudentService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> postMethodName(@RequestBody Student student) {
        //TODO: process POST request
        
        Student createdStudent = studentService.createStudent(student);

       
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }
    
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {

        List<Student> studentList = studentService.getAllStudents();

        if(null == studentList) {

            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(studentList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        Student student = studentService.getStudent(id);
        if(null == student) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {

        Student updatedStudent = studentService.updateStudent(id,student);

        return ResponseEntity.ok(updatedStudent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {

        Boolean isDeleted = studentService.deleteStudent(id);
        if(null == isDeleted) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

}
