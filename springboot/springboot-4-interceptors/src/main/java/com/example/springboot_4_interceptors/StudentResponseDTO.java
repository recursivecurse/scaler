package com.example.springboot_4_interceptors;

public class StudentResponseDTO {

    private String message;
    
    StudentResponseDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
