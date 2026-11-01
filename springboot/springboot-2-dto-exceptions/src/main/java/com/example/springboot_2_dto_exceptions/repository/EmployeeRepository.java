package com.example.springboot_2_dto_exceptions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot_2_dto_exceptions.entity.Employee;

@Repository 
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
