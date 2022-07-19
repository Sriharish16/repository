package com.training.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {


	public static void countryList(List<StreamApi>pop1,String searchName) {
		List<String>name=pop1.stream().filter(e->e.getCountry().contains(searchName)).map(d->d.getPlace())
				.collect(Collectors.toList());
		
		name.forEach(System.out::println);
	}
	
	
	public static void findCount(List<StreamApi>pop, String searchValue) {
		long list= pop.stream().filter(t->t.getCountry().contains(searchValue)).count();
		System.out.println(searchValue+"Occur:="+list+"times");
}
	
	public static void totalPopulation(List<StreamApi>pop2,String searchValue) {
		long total= pop2.stream().filter(e->e.getCountry().contains(searchValue))
				.mapToLong(d->d.getPopulation()).sum();
				
				System.out.println(searchValue+"Total Population="+total);
	}
	
	public static void findPopulation(List<StreamApi>)
	
	public static void main (String[]args)
	{
		StreamApi kansas= new StreamApi("USA","Kansas City",501957);
		StreamApi chennai= new StreamApi("India","Chennai",7090000);
		StreamApi losangeles= new StreamApi("USA","Los Angeles",3970000);
		StreamApi kathmandu= new StreamApi("Nepal","Kathmandu",1000000);
		StreamApi kolkata= new StreamApi("India","Kolkata",14900000);
		StreamApi denver= new StreamApi("USA","Denver",706000);
		
		List<StreamApi>pop=Arrays.asList(kansas,chennai,losangeles,kathmandu,kolkata,denver);
		
		findCount(pop, "India");
		findCount(pop, "USA");
		findCount(pop, "Nepal");
		
		System.out.println("=============================================");
		countryList(pop, "USA");
		countryList(pop, "India");
		countryList(pop, "Nepal");
		
		System.out.println("==============================================");
		
		totalPopulation(pop, "USA");
		totalPopulation(pop, "India");
		totalPopulation(pop, "Nepal");
		


	}
	

}
