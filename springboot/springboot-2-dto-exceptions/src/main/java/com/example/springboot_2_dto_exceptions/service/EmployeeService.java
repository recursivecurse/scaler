package com.example.springboot_2_dto_exceptions.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.springboot_2_dto_exceptions.dto.requestdto.EmployeeRequestDto;
import com.example.springboot_2_dto_exceptions.dto.responsedto.EmployeeResponse;
import com.example.springboot_2_dto_exceptions.dto.responsedto.EmployeeResponseDto;
import com.example.springboot_2_dto_exceptions.entity.Employee;
import com.example.springboot_2_dto_exceptions.exception.EmployeeNotFound;
import com.example.springboot_2_dto_exceptions.repository.EmployeeRepository;

@Service 
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    EmployeeService(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }

    public EmployeeResponseDto createEmployee(EmployeeRequestDto employeeDto) {

        Employee employee = mapToEntity(employeeDto);
        Employee createdEmployee = employeeRepository.save(employee);
        EmployeeResponseDto employeeResponseDto = mapToDto(createdEmployee);
        return employeeResponseDto;
    }
    
    public EmployeeResponse getEmployee(Long id) {

        Employee employee = employeeRepository.findById(id)
                            .orElseThrow(()-> new EmployeeNotFound("No Employee with the id : "+ id ));

        EmployeeResponse fetchedEmployee = mapToDtoGet(employee);

        return fetchedEmployee;
    }

    public Employee mapToEntity(EmployeeRequestDto employeeDto) {

        return new Employee(employeeDto.getId(),
                            employeeDto.getName(),
                            employeeDto.getEmployeeId(),
                            employeeDto.getDepartment(),
                            false,
                            LocalDateTime.now(), 
                            LocalDateTime.now());
    }

     public EmployeeResponseDto mapToDto(Employee employee) {

        return new EmployeeResponseDto(employee.getId(),
                            employee.getName(),
                            employee.getEmployeeId(),
                            employee.getDepartment(),
                            LocalDateTime.now());
    }

    public EmployeeResponse mapToDtoGet(Employee employee) {

        return new EmployeeResponse(employee.getId(),
                            employee.getName(),
                            employee.getEmployeeId(),
                            employee.getDepartment());
                            
    }
}
