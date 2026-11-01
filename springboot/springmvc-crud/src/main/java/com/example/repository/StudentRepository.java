package com.example.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.entity.Student;

@Repository 
public class StudentRepository {

    private Map<Long,Student> map;

    public StudentRepository() {
        this.map = new HashMap<>();
    }

    public void saveStudent(Student student)
    {
        map.put(student.getId(),student);
    }

    public Student getStudent(Long id)
    {
        return map.getOrDefault(id,null);
    }

    public List<Student> getAll()
    {
        return new java.util.ArrayList<>(map.values());
    }


    
}
