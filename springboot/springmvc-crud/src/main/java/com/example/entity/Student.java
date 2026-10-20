package com.example.entity;

public class Student {

    private Long id;
    private String name;
    private Integer rollNo;
    private String email;

    
    public Student() {}

    public Student(Long id, String name, Integer rollNo, String email) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
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
    public Integer getRollNo() {
        return rollNo;
    }
    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    


}
