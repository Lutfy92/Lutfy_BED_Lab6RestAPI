package com.example.registrationlogindemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registrationlogindemo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	
}
