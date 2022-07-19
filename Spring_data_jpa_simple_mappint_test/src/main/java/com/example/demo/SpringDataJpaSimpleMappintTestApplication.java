package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeService;

@SpringBootApplication
public class SpringDataJpaSimpleMappintTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaSimpleMappintTestApplication.class, args);
	Employee sri= ctx.getBean(Employee.class);
	
	EmployeeService sri1= ctx.getBean(EmployeeService.class);
	
//	Employee added= sri1.add(sri);
	sri1.findByDOB(LocalDate.of(2000, 07, 07)).forEach(System.out::println);
	}
//	if(added!=null) {
//		System.out.println("One Employee Added");
//	}
//	ctx.close();
//			}
	
	@Bean
	
	public Employee suba() {
		return new Employee(101,"Subashini",LocalDate.of(2000, 07, 07),"Trichy","Java",1234567889);
	}

}
