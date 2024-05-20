package com.ajacs.compositionex;

public class Engine {
	int horsePower;
	String fuelType;
	Engine(int horsePower,String fuelType){
		this.horsePower=horsePower;
		this.fuelType=fuelType;
	}
	public void start() {
		System.out.println("engine Started");
	}
	public void stop() {
		System.out.println("engine Stop");
	}

}
