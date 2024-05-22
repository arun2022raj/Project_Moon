package com.ajacs.exceptions;
import java.util.Scanner;

public class ArrayIndexOutOfBoundExceptionExample {
	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element you want to access");
		int ele= sc.nextInt();
		try {
			System.out.println(arr[ele]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter valid element which is lessthan 5");
		}
		sc.close();
	}

}
