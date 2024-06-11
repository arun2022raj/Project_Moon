package com.ajacs.stringtask1006;

public class DigitsOnly {
	public static void main(String[] args) {
		String s="123456a78";
		boolean f=false;
		for(int i=0;i<s.length();i++) {
			if (!Character.isDigit(s.charAt(i))) {
				System.out.println("string contain Alphabets");
				f=true;
			}
		}
		if (f==false) {
			System.out.println("string contain only digits");
		}
			
		
	}

}
