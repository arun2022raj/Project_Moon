package com.ajacs.strings;

public class CharOccurrence {
	public static void main(String[] args) {
		String s="I am proud to be Indian";
		char ch='I';
		int c=0;
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)==ch) {
				c++;
			}	
		}
		System.out.println(c);
	}

}
