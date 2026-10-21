package com.example.springboot_2_dto_exceptions.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_2_dto_exceptions.dto.requestdto.EmployeeRequestDto;
import com.example.springboot_2_dto_exceptions.dto.responsedto.EmployeeResponse;
import com.example.springboot_2_dto_exceptions.dto.responsedto.EmployeeResponseDto;
import com.example.springboot_2_dto_exceptions.entity.Employee;
import com.example.springboot_2_dto_exceptions.service.EmployeeService;

import jakarta.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/employee") 
public class EmployeeController {

    private EmployeeService employeeService;

    EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping
    public ResponseEntity<EmployeeResponseDto> createEmployee(@RequestBody EmployeeRequestDto employee) {
        
        EmployeeResponseDto employeeResponseDto = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeResponseDto);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponse> getMethodName(@PathVariable Long id) {

        EmployeeResponse employeeResponse = employeeService.getEmployee(id);
        return ResponseEntity.ok(employeeResponse);
    }   
    
}
