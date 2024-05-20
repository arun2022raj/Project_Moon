package com.ajacs.oops;

public class Car extends Vehicle {
	private int numDoors;
	Car(String make,String model,int year,int numDoors){
		super(make,model,year);
		this.numDoors=numDoors;
	}
	public void drive() {
		System.out.println(make+" Started Driving");
	}
	public void stop() {
		System.out.println(make+" "+model+" Stoped ");
	}
	

}
