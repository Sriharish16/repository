package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import java.time.LocalDate;

import javax.persistence.*;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@Entity
@Table(name="sri_trip_details1")
public class TripDetail {
	
	@Id
	@Column(name="trip_Id")
	int tripId;
	
	@Column(name="Driver_Id")
	int driverId;
	
	@Column(name="tripDate")
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate tripDate;
	
	@Column(name="amount")
	double amount;


}
