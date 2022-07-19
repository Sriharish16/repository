package com.example.demo.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
	
	public List<Passenger>findByPassengerName(String name);
	
	public List<Passenger>findByTripHistoryListTripDateTime(LocalDateTime date);

}
