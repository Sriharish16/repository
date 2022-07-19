package com.example.demo.entity;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="sri_passenger")
@AllArgsConstructor
@NoArgsConstructor

public class Passenger {
	@Id
	@Column(name="passenger_Id")
	int passengerId;
	
	@Column(name="passenger_name")
	String passengerName;
	
	@Column(name="email")
	String email;
	
	@Column(name="Location")
	String location;

	@OneToMany(targetEntity=TripHistory.class,fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="Passenger_ref",referencedColumnName="passenger_Id")
	List<TripHistory> tripHistoryList; 
	
	
}
