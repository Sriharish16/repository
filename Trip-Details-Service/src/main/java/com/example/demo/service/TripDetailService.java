package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TripDetail;
import com.example.demo.repo.TripDetailRepository;

@Service
public class TripDetailService {
	
	@Autowired
	public TripDetailService(TripDetailRepository repo) {
		super();
		this.repo = repo;
	}


	public TripDetailRepository repo;
	

	public List<TripDetail>findAll(){
		return this.repo.findAll();
	}
	
	public Optional<TripDetail>findById(int id){
		return this.repo.findById(id);
		
	}
	
	public TripDetail save(TripDetail entity) {
		return this.repo.save(entity);
		
	}
	
	public void remove(int id) {
		
		Optional<TripDetail>foundElement=repo.findById(id);
		if(foundElement.isPresent()) {
			repo.deleteById(id);
		}
		else {
			throw new RuntimeException("Element with"+id+"Not Present");
			}
		}
	
	public List<TripDetail> findByDriverId(int id) {
		return this.repo.findByDriverId(id);
	}
	

}
