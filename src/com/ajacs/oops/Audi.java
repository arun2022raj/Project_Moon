package com.ajacs.oops;

public class Audi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v= new Vehicle("Audi","model-1",2002);
		v.start();
		v.stop();
		Car c=new Car("lamborghini","jarama",2000,4);
		c.drive();
		c.start();
		c.stop();
	}

}
