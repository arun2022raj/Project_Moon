package com.ajacs.oops;

public class Vehicle {
	protected String make;
	protected String model;
	protected int year;
	Vehicle(String make,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public void start() {
		System.out.println("Vehicle started");
	}
	public void stop() {
		System.out.println(make+" "+model+" Stoped ");
	}
}
