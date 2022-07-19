package com.training;

public class Driver 
{
 private int driverId;
 private String driverName;
 private int age;
 private int salary;
 
 



public Driver(int driverId, String driverName, int age, int salary) {
	super();
	this.driverId = driverId;
	this.driverName = driverName;
	this.age = age;
	this.salary = salary;
}


public int getDriverId() {
	return driverId;
}


public void setDriverId(int driverId) {
	this.driverId = driverId;
}


public String getDriverName() {
	return driverName;
}


public void setDriverName(String driverName) {
	this.driverName = driverName;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public double getSalary() {
	return salary;
}


public void setSalary(int salary) {
	this.salary = salary;
}


@Override
public String toString() {
	return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", age=" + age + ", salary=" + salary + "]";
}
 
 
 
}
