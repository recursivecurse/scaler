package com.example.springboot_2_dto_exceptions.exception;

public class EmployeeNotFound extends RuntimeException{

    public EmployeeNotFound(String message) {
        super(message);
    }

}
