package com.loopexam;

public class PolindromeNumber {
	public static boolean isPolindrome(int num) {
		String s=String.valueOf(num);
		StringBuilder s1=new StringBuilder(s);
		String s2=new String(s1.reverse());
		return s.equals(s2);
//		int original=num;
//		int rem=0;
//		int revNum=0;
//		while(num!=0) {
//			rem=num%10;
//			revNum=(revNum*10)+rem;
//			num=num/10;
//		}
//		return original==revNum;
//		if (original==revNum) {
//			return true;
//		}
//		return false;
	}
	public static void main(String[] args) {
		int num=2345432;
		if (isPolindrome(num)) {
			System.out.println("the given number "+num+" is Polindrome");
		}
		else {
			System.out.println("the given number "+num+" is not Polindrome");
		}
	}

}
