package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.repo.PassengerRepository;

@Service

public class PassengerService {
	
//	@Autowired
//	List<TripHistory> tripHistoryList;
//	
//@Autowired
//Passenger pas;
	

	PassengerRepository repo;
	
	
	@Autowired
	public PassengerService(PassengerRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Passenger>getByPassengerName(String name){
		
		return this.repo.findByPassengerName(name);
	}
	
	public List<Passenger>findByTripDate(LocalDateTime date){

		return this.repo.findByTripHistoryListTripDateTime(date);
	}
	
	public Passenger add(Passenger entity) {
		
		return this.repo.save(entity);
		
	}
	public List<Passenger >findAll(){
		return this.repo.findAll();
	}
	
}
