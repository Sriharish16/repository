package com.training.jason;

import java.util.List;
import java.util.Optional;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {
	
	private static StudentService service=new StudentService();
	
	public StudentResource() {
		super();
		
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudent() {
		
	
		return service.getAll();
		
	}
	
	@GET
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student findById(@PathParam("rollNumber")int id) {
		
		return service.findById(id)
				.orElseThrow(()->new RuntimeException("Id not found"));
		
	}
	

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Student add(Student student) {
		
		boolean result=service.add(student);
		if(result) {
			return student;
		}else {
			return null;
		}
		
	}
	
	@DELETE
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean remove(@PathParam("rollNumber")int id) {
		return service.remove(id);
	}
	
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	public Student getStudent() {
//		
//		Student ram= new Student(101,"Ramesh",98.0);
//		
//		return ram;
//		a
//	}
	
	
	
	
	
	
	

	
}
