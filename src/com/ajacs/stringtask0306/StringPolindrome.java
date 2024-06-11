package com.ajacs.stringtask0306;

public class StringPolindrome {
	public static Boolean stringPolindrome(String s) {
		for(int i=0;i<s.length()/2;i++) {
			if (s.charAt(i)!=s.charAt(s.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s= "asdffdsa";
		if (stringPolindrome(s)) {
			System.out.println("give string "+s+" is polindrome ");
		}
		else {
			System.out.println("give string "+s+" is Not polindrome ");
		}
		
	}

}
