package com.loopexam;

public class FibonacciNumbers {
	public static void fibonacci(int range) {
		int first=0;
		int second=1;
		int next;
//		if (range<1)
//			System.out.println("give valid range more than zero");
//		switch (range) {
//		case 1:
//			System.out.print(first+" ");
//			break;
//		case 2:
//			System.out.print(first+" "+second+" ");
//			break;
//		default:
//			System.out.print(first+" "+second+" ");
//			for (int i=2;i<range;i++) {
//				next=first+second;
//				System.out.print(next+" ");
//				first=second;
//				second=next;
//			}
//		}
		if (range < 1) {
		    System.out.println("give valid range more than zero");
		} else {
		    System.out.print(first);
		    if (range > 1) {
		        System.out.print(" " + second);
		        for (int i = 2; i < range; i++) {
		            next = first + second;
		            System.out.print(" " + next);
		            first = second;
		            second = next;
		        }
		    }
		    System.out.println();
		}
//		if (range<1) {
//			System.out.println("give valid range more than zero");
//		}
//		else if(range==1) {
//			System.out.print(first+" ");
//		}
//		else if(range==2) {
//			System.out.print(first+" "+second+" ");
//		}
//		else {
//			System.out.print(first+" "+second+" ");
//			for (int i=2;i<range;i++) {
//				next=first+second;
//				System.out.print(next+" ");
//				first=second;
//				second=next;
//			}
//		}
	}
	public static void main(String[] args) {
		fibonacci(10);
	}

}
