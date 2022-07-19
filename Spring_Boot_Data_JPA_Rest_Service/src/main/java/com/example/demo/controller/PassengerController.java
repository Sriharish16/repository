package com.example.demo.controller;


import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Passenger;
import com.example.demo.service.PassengerService;

@RestController
@RequestMapping(path="/api/v1")
public class PassengerController {
	
	
	private PassengerService service;
	
	@Autowired
	public PassengerController(PassengerService service) {
		super();
		this.service = service;
	}

	@GetMapping(path="/passengers/srch/{passengerName}")
	public List<Passenger>getByname(@PathVariable("passengerName")String name){
		return this.service.getByPassengerName(name);
	}
	
	@GetMapping(path = "/passengers/srch/time/{tripListTripDateTime}")
	public List<Passenger> findByTripListTripDateTime(@PathVariable("tripListTripDateTime")
	@DateTimeFormat(iso=ISO.DATE_TIME) LocalDateTime date){
		return this.service.findByTripDate(date);

	}
	@GetMapping(path="/passengers/findall")
	public List<Passenger> getPassangerDetails()
	{
		return service.findAll();
	}
	@PostMapping(path="/passengers")
	public ResponseEntity<Passenger>addDriver(@RequestBody Passenger entity){
		Passenger passenger= this.service.add(entity);
				URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id").buildAndExpand(entity.getPassengerId()).toUri();
		return ResponseEntity.status(HttpStatus.CREATED).body(passenger);
	}
	
	
}
