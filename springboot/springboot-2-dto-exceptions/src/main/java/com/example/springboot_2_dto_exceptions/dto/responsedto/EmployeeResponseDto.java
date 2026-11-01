package com.example.springboot_2_dto_exceptions.dto.responsedto;

import java.time.LocalDateTime;

public class EmployeeResponseDto {

    private Long id;
    private String name;
    private String employeeId;
    private String department;
    private LocalDateTime createdAt;

    

    public EmployeeResponseDto(Long id, String name, String employeeId, String department, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.createdAt = createdAt;
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
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    

}
