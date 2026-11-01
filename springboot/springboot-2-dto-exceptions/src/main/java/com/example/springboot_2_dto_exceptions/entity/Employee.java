package com.example.springboot_2_dto_exceptions.entity;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Employee {

    @Id
    private Long id;
    private String name;
    private String employeeId;
    private String department;
    
    private Boolean deleted;    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Employee(){}

    public Employee(Long id, String name, String employeeId, String department, Boolean deleted,
            LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.deleted = deleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    

}
