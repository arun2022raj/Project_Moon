package com.ajacs.exceptions;
import java.util.Scanner;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string value to convert interger");
		String string=sc.next();
		Integer num=0;
		try {
			num=Integer.parseInt(string);
		}catch(NumberFormatException e) {
			System.out.println("Enter a valid numerical String to conver Interger");
		}
		if (num!=0) {System.out.println(num);}
		sc.close();

	}

}
