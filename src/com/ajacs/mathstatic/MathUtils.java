package com.ajacs.mathstatic;

public abstract class MathUtils {
	public static double add(double... a) {
		double sum=0;
		for (double i:a) {
			sum+=i;
		}
		return sum;
	}
	public static double substract(double num1,double num2) {
		return num1-num2;
	}
	public static double multiply(double... a) {
		double mul=1;
		for(double i:a) {
			mul*=i;
		}
		return mul;
	}
	public static double divide(double divisor,double divider) {
		return (divisor/divider);
	}

}
