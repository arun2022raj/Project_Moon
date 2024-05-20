package com.ajacs.interfacemodule;

public class Triangle implements Shape {
	private int side1;
	private int side2;
	private double side3;
	private double sp;
	Triangle(int side1,int side2,double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		this.sp=(side1+side2+side3)/2.0;
	}
	

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of a triangel : "+Math.sqrt(sp*(sp-side1)*(sp-side2)*(sp-side3)));

	}

	@Override
	public void calculateperimeter() {
		// TODO Auto-generated method stub
		System.out.println("perimeter of tiangle : "+(side1+side2+side3));

	}

}
