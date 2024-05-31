package com.ajacs.strings;

public class ReverseWords {
	
	public static void main(String[] args) {
		String s="be proud to be Indian";
		String[] s1=s.split(" ");
		s="";
		for(int i=s1.length-1;i>=0;i--) {
			s+=s1[i]+" ";
		}
		System.out.println(s);
	}

}
