package com.example.springboot_4_interceptors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
@RequestMapping("/demo")
public class StudentController {

    private StudentService studentService;

    StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<StudentResponseDTO> postMethodName(@RequestBody Student student) {
        StudentResponseDTO response =  new StudentResponseDTO("Student created successfully");
        return (studentService.addStudent()) ? ResponseEntity.status(HttpStatus.CREATED).body(response) : ResponseEntity.internalServerError().build();
    }
    

}
