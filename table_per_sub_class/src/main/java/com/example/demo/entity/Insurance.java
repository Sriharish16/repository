package com.example.demo.entity;

import javax.persistence.*;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="sri_ins_2022")
@Inheritance(strategy =InheritanceType.JOINED)
public class Insurance {
	
	
	@Id
	@Column(name="policy_number")
	private int policyNumber;
	
	@Column(name="policy_holder_name",length=30, nullable=false)
	private String policyHolderName;
	
}
