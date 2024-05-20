package com.ajacs.abstractex;

public class Rectangle extends Shape{
	protected int length;
	protected int breadth;
	Rectangle(int length,int breadth){
		this.length =length;
		this.breadth=breadth;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("reactangle is drwan with length "+this.length+" and breadth "+this.breadth);
		
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("area of the rectangle is : " +this.length*this.breadth);
		
	}

}
