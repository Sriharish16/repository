package com.example.demo.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee>findByDateofBirth(LocalDate date);

}
