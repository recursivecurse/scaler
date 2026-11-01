package com.example.springboot_crud.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot_crud.entity.Student;


@Repository 
public interface StudentRepository extends JpaRepository<Student,Long>{

    public List<Student> findByDeletedIsFalse();

    public Optional<Student> findByIdAndDeletedIsFalse(Long id);
}
