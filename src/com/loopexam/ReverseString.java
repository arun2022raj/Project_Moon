package com.loopexam;

public class ReverseString {
	public static String reverseString(String s) {
		return String.valueOf(new StringBuffer(s).reverse());	
//		String revString="";
//		char ch;
//		
//		for(int i=s.length()-1;i>=0;i--) {
//			ch=s.charAt(i);
//			revString=revString+ch;
//		}
//		return revString;
	}
	public static void main(String[] args) {
		System.out.println(reverseString("ujnes amarihsah"));	
	}
}
