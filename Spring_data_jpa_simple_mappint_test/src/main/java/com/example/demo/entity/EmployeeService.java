package com.example.demo.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	private EmployeeRepository repo;
	
@Autowired
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
public Employee add(Employee entity) {
	return this.repo.save(entity);
}

	public List<Employee>findByDOB(LocalDate date){
		return this.repo.findByDateofBirth(date);
	
}
	
	
	

}
