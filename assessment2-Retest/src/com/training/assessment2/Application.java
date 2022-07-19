package com.training.assessment2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;


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
	public static void findPopulation(List<StreamApi>pop3,String searchValue) {
		List<Integer> total= pop3.stream().filter(e->e.getPlace().contains(searchValue))
				.map(d->d.getPopulation()).collect(Collectors.toList());
				
				System.out.println(searchValue+" Population of="+total);
	}
	
	

	public static void main(String[] args) {
		
		StreamApi kansas = new StreamApi("USA","Kansas City",501957);
		StreamApi chennai= new StreamApi("India","Chennai",7090000);
		StreamApi losAngeles= new StreamApi("USA","Los Angeles",3970000);
		StreamApi kathmandu= new StreamApi("Nepal","Kathmandu",1000000);
		StreamApi kolkata= new StreamApi("India","Kolkata",14900000);
		StreamApi denver= new StreamApi("USA","Denver",706000);
		
		List<StreamApi>pop= Arrays.asList(kansas,chennai,losAngeles,kathmandu,kolkata,denver);
		
		countryList(pop, "USA");
		countryList(pop, "India");
		countryList(pop, "Nepal");
		
		findCount(pop, "USA");
		findCount(pop, "India");
		findCount(pop, "Nepal");
		
		totalPopulation(pop, "USA");
		totalPopulation(pop, "India");
		totalPopulation(pop, "Nepal");
		
		System.out.println("===========================");
		findPopulation(pop, "Kansas City");
		findPopulation(pop, "Chennai");
	}

}
