package com.ajacs.interfacemodule;

public interface Shape {
	public void calculateArea();
	default void calculateperimeter() {};
}
