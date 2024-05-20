package com.loopexam;

public class StarPattern {
	private static void starPattern(int height) {
//		for (int i=0;i<height;i++) {
//			for (int j=0;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.print('\n');
//		}
//		for(int i=1;i<=height;i++) {
//			System.out.println("* ".repeat(i));
//		}
		System.out.print("*\n**\n***\n****");
	}
	public static void main(String[] args) {
		starPattern(4);
	}

}
