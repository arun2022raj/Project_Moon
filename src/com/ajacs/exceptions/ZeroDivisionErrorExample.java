package com.ajacs.exceptions;
import java.util.Scanner;

public class ZeroDivisionErrorExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Division calculator");
		System.out.println("please Enter Dividend");
		int dividend=sc.nextInt();
		System.out.println("please Enter Divisor");
		int divisor=sc.nextInt();
		int quotient =0 ;
		try { 
			quotient = dividend/divisor;
		} catch(ArithmeticException e) {
			System.out.println("Enter valid divisor greater than zero");
		}
		if (quotient!=0) {System.out.println("The quotient of Division operation is : "+quotient);}
		sc.close();
	}

}
