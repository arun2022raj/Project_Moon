package com.student;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenFinder {
	
	public static void evenFinder(int[] arr) {
		for(int i:arr) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
	}
	public static void evenFind(ArrayList<Integer> arr) {
		for(int i:arr) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Integer i;
		int[] arr= {2,1,3,2,4,5,3,2,5,6,4,3,7,2};
		ArrayList<Integer> ar= new ArrayList<>();
		for (;true;) {
			i= sc.nextInt();
			if (i==0)
				break;
			ar.add(i);
		}
		System.out.println("with int array");
		evenFinder(arr);
		System.out.println("with array list");
		evenFind(ar);
		sc.close();
	}
}
