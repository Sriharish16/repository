package com.example.demo.ifaces;

import java.util.List;

public interface CrudRepositry<T> {
	
	public int add(T t);
	public List<T>findAll();
	public T findById(int id);
	public int update(T t);
	public int remove(int id);

}
