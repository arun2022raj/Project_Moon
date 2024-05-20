package com.ajacs.interfacemodule;
import java.lang.Math;

public class Circle implements Shape {
	private int radius;
	Circle(int radius){
		this.radius=radius;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of the Circle : "+(Math.PI*(radius*radius)));

	}

	@Override
	public void calculateperimeter() {
		// TODO Auto-generated method stub
		System.out.println("perimeter of the circle : "+(2*Math.PI*radius));
	}

}
