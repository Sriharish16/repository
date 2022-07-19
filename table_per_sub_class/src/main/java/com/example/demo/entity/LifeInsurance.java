package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="sri_life1_2022")

@PrimaryKeyJoinColumn(name="id",referencedColumnName="policy_number")
public class LifeInsurance extends Insurance {
	
	
	@Column(name="age")
	private int age;
	
	@Column(name="profile")
	private String profile;
	
	public LifeInsurance(int policyNumber, String policyHolderName, int age, String profile) {
		super(policyNumber, policyHolderName);
		this.age = age;
		this.profile = profile;
	}
	
	
	

}
