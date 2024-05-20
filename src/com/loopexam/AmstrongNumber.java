package com.loopexam;
import java.lang.Math;

public class AmstrongNumber {
	public static boolean isAmstrong(int num) {
		double count=0;
		int org1=num,org2=num ;
//		int len=(int) Math.log10(num);
//		int len=String.valueOf(num).length();   alternative to find lenght with string
		while(num!=0) {
			count++;
			num=num/10;
		}
		double rem=0;
		int amg=0;
		while(org1!=0) {
			rem=org1%10;
			amg=amg+(int)Math.pow(rem, count);
			org1=org1/10;
		}
		return amg==org2;
		
	}
	public static void main(String[] args) {
		int num=548834;
		if (isAmstrong(num)) {
			System.out.println("given number "+num+" is Amstrong");
		}
		else {
			System.out.println("given number "+num+" is not Amstrong");
			}
		
		
	}

}
