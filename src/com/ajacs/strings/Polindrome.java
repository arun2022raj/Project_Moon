package com.ajacs.strings;

public class Polindrome {
	private static Boolean polindrome(String s) {
		for(int i=0;i<(s.length()/2);i++) {
			if (s.charAt(i)!=s.charAt(s.length()-i-1))
				return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		System.out.println(polindrome("jakkaj"));
		
	}

}
