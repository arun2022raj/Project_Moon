package com.ajacs.abstractex;

public class AbstractDemo {
	public static void main(String[] args) {
		Circle c=new Circle(5);
		c.draw();
		c.calculateArea();
		Rectangle r=new Rectangle(4,5);
		r.draw();
		r.calculateArea();
		Triangle t=new Triangle(3,4,5);
		t.draw();
		t.calculateArea();
		Triangle t2=new Triangle(3,4,5);
		t2.draw();
		t2.calculateArea();
	}
	

}
