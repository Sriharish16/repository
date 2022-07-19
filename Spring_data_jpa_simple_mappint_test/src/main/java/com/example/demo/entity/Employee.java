package com.example.demo.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="sri_employee")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@Column(name="Employee_id")
	int employeeId;
	
	@Column(name="Employee_name")
	String employeeName;
	
	@Column(name="Date_Of_Birth")
	LocalDate dateOfBirth;
	
	@Column(name="Location")
	String location;
	
	@Column(name="Skill_Set")
	String skillSet;
	
	@Column(name="Phone_Number")
	long phoneNumber;
	
}

