package com.loopexam;

public class NumberPyramid {
	public static void pyramid(int height) {
		int h1=height;
		for(int i=1;i<=h1;i++) {
			System.out.print(" ".repeat(height-1));
			System.out.println((i+" ").repeat(i));
			height-=1;
		}
//		for(int i=1;i<=h1;i++) {
//		System.out.print(" ".repeat(height-1));
//		for (int j=1;j<i+1;j++) {
//			System.out.print(i+" ");
//		}
//		System.out.print("\n");
//		height-=1;
//	}
		
		
		
	}
	public static void main(String[] args) {
		pyramid(9);
		
	}

}
