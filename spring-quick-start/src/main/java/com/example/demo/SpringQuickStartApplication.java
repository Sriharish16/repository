package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.student.Invoice;
import com.example.demo.student.Student;
import com.example.demo.student.Teacher;
import com.example.demo.student.Bill;
import com.example.demo.student.Customer;
import com.example.demo.student.CustomerList;

@SpringBootApplication
public class SpringQuickStartApplication {

	public static void trail() {
		ApplicationContext ctx=null;
				
		//When using Id need to cast to specific bean since return type of getbean methos is object
		Student ram=(Student)ctx.getBean("ram");
		
		//Casting not requires,but there should be only one bean of that type
		//will throw exception
		Student shyam=ctx.getBean(Student.class);
		
				
		
//		System.out.println(ctx.getBean("ram"));
		//When more than one Bean of the same type available should use id and class name

		Teacher stella=ctx.getBean("ravi",Teacher.class);
		
		stella.setId(494);
		stella.setName("Stella Sundari");
		stella.setSubject("Fluid Mech");

		
		Teacher ram1= (Teacher)ctx.getBean("ravi");
		
		System.out.println(stella);
	}
		
		public static void main(String[]args) {ApplicationContext ctx=
				SpringApplication.run
		(SpringQuickStartApplication.class,args);
		
		Invoice inv=ctx.getBean(Invoice.class);
		System.out.println(inv);
		
		
		Bill bill=ctx.getBean(Bill.class);
		System.out.println("Customer:="+bill.getCustomer());
		System.out.println("Product:="+bill.getProduct());
		
		
		CustomerList list=ctx.getBean(CustomerList.class);
		
		list.getCustList().forEach(System.out::println);
		
		
	}

}  