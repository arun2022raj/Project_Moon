package com.loopexam;
import java.lang.Math;

public class PrimeNumber {
	public static boolean isPrime(int num) {
		for (int i=2;i<=Math.sqrt(num);i++) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int num=53;
		if (isPrime(num)) {
			System.out.println("the given number "+num+" is prime");
		}
		else {
			System.out.println("the given number "+num+" is not prime");
		}
		
		
	}

}
