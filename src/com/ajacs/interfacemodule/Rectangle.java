package com.ajacs.interfacemodule;

public class Rectangle implements Shape {
	private int length;
	private int breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	

	@Override
	public void calculateArea() {
		System.out.println("Area of the rectangle : "+(length*breadth));
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateperimeter() {
		// TODO Auto-generated method stub
		System.out.println("perimeter of the rectangel : "+(2*(length+breadth)));

	}

}
