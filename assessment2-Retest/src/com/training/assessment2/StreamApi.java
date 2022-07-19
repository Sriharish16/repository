package com.training.assessment2;

public class StreamApi {

	public String Country;
	public String Place;
	public int population;
	
	public StreamApi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StreamApi(String country, String place, int population) {
		super();
		Country = country;
		Place = place;
		this.population = population;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "StreamApi [Country=" + Country + ", Place=" + Place + ", population=" + population + "]";
	}
	
	
	
}
