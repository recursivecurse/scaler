package com.example.springboot_2_dto_exceptions.dto.requestdto;

public class EmployeeRequestDto {

    private Long id;
    private String name;
    private String employeeId;
    private String department;

    public EmployeeRequestDto(){}

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
