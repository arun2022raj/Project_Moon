package com.ajacs.compositionex;

public class Car {
	Engine e;
	Car(int horsePower,String fuelType){
	this.e=new Engine(horsePower,fuelType);
	}
	public void start() {
		e.start();
	}
	public void stop() {
		e.stop();
	}

}
