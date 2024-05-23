package com.ajacs.exceptions;

import java.util.Scanner;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element you want to access as a divisor");
		int ele= sc.nextInt();
		try {
			System.out.println(arr[ele]);
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
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter valid element which is lessthan 5");
		}
		sc.close();
		
		
		
	}
}
