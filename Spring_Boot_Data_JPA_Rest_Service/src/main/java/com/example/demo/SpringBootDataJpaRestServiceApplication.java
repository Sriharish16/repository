package com.example.demo;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.repo.PassengerRepository;
import com.example.demo.service.PassengerService;

@SpringBootApplication
public class SpringBootDataJpaRestServiceApplication {

	public static void main(String[] args) {
	SpringApplication.run(SpringBootDataJpaRestServiceApplication.class, args);
		

	}
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			PassengerRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				
				TripHistory trip1 = new TripHistory(5671,LocalDateTime.of(2022,11,18,06,30),"chennai","ooty",5000.00);
				List<TripHistory> tripList = new ArrayList<TripHistory>();
				tripList.add(trip1);
				
				repo.save(new Passenger(101,"leo","leo@gmail.com","chennai",tripList));
			}
		};
}
}
