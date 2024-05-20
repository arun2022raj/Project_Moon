package com.ajacs.interfacemodule;
import java.lang.Math;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(5);
		c.calculateArea();
		c.calculateperimeter();
		Rectangle r=new Rectangle(4,5);
		r.calculateArea();
		r.calculateperimeter();
		Triangle t= new Triangle(6,8,Math.sqrt(73));
		t.calculateArea();
		t.calculateperimeter();

	}

}
