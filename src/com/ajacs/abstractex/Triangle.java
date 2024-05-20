package com.ajacs.abstractex;

public class Triangle extends Shape {
	private int side1;
	private int side2;
	private int side3;
	Triangle(int side1,int side2,int side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		this.sp=(side1+side2+side3)/2;
	}
	private int sp;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Triangle is created with the following sides : "+side1+" "+side2+" "+side3);
		
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of a triangel : "+Math.sqrt(sp*(sp-side1)*(sp-side2)*(sp-side3)));

		
	}

}
