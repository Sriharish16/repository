package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CabDriverRepository;
import com.example.demo.entity.CabDriver;

@Service
public class CabDriverService {

	
	private CabDriverRepository repo;
	
	
	@Autowired
	public CabDriverService(CabDriverRepository repo) {
		super();
		this.repo = repo;
	}
	

	public List<CabDriver>findAll(){
		return this.repo.findAll();
	}
	
	public Optional<CabDriver>findById(int id){
		return this.repo.findById(id);
		
	}
	
	public CabDriver save(CabDriver entity) {
		return this.repo.save(entity);
		
	}
	
	public void remove(int id) {
		
		Optional<CabDriver>foundElement=repo.findById(id);
		if(foundElement.isPresent()) {
			repo.deleteById(id);
		}
		else {
			throw new RuntimeException("Element with"+id+"Not Present");
			}
		}
	
	public CabDriver findByDriverName(String name) {
		return this.repo.findByDriverName(name);
	}
	
	
	
}
