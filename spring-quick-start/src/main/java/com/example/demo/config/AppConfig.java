package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.student.Customer;
import com.example.demo.student.Product;
import com.example.demo.student.Student;
import com.example.demo.student.Teacher;

@Configuration

public class AppConfig {
	
	//id of bean as method name
	@Bean
	public Student ram() {
		return new Student(89,"Ramesh",98);
	}
	@Bean
	public Teacher ravi() {
		return new Teacher(90,"Sriharish","CSE");
	}
	@Bean
	public Product tv() {
		return new Product(90,"Sonyy");
		
}
	@Bean
	public Customer sree() {
		return new Customer (102,"sree");}
	
	@Bean
	public Customer sri() {
		return new Customer (103,"sri");}
	@Bean
	public Customer magesh() {
		return new Customer (104,"magesh");}
	}

