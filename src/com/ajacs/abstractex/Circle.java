package com.ajacs.abstractex;
import java.lang.Math;


public class Circle extends Shape{
	protected int radius;
	Circle(){
		
	}
	Circle(int radius){
		this.radius=radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle Drawn with radius "+radius);
		
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("area of the circle : "+(Math.PI*(radius*radius)));
		
	}
	
		

}
