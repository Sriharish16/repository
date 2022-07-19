package com.training.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.training.Driver;

public class Application {

	public static void totalSalary(List<Driver>data1, String srchString) {
		
		List<Integer> total=data1.stream().filter(e->e.getDriverName().contains(srchString)).map(d->d.getAge()).collect(Collectors.toList());
		
		total.forEach(System.out::println);
	}
	
	public static void sumOfSalary(List<Driver>data2) {
		List<Integer>total1= data2.stream().filter(e->e.getDriverId()).mapToDouble(d->d.getSalary();
		
	}
	public static void main(String[] args) 
	{
		Driver driv1 = new Driver(100, "ram", 30, 100);
		
		Driver driv2 = new Driver(200, "sureshh", 45, 200);
		
	  List<Driver>stream1=Arrays.asList(driv1,driv2);
	  
	 totalSalary( stream1,"ram");
	  
 //	   System.out.println(stream1);
 	   
 	   
}
}
