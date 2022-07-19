package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="sri_trip_history")

@AllArgsConstructor
@NoArgsConstructor

public class TripHistory {

	@Id
	@Column(name="trip_Id")
	int tripId;
	
	@Column(name="trip_Date_time")
	LocalDateTime tripDateTime;
	@DateTimeFormat(iso=ISO.DATE_TIME)
	
	@Column(name="source")
	String source;
	
	@Column(name="destination")
	String destination;
	
	@Column(name="amount")
	double amount;
	
}
