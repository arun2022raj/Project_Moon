package com.ajacs.encapsulationex;

public class Employee {
	private String id;
	private String name;
	private double salary;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setId(String id) {
		this.id=id;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getSalary() {
		return this.salary;
	}
	

}
