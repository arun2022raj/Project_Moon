package com.ajacs.stringtask0306;

public class StringReverse {
	public static String stringReverse(String s) {
		String revs="";
		for (int i=s.length()-1;i>=0;i--) {
			revs+=s.charAt(i);
		}
		return revs;
		
	}
	
	public static void main(String[] args) {
		String s="jakkam";
		System.out.println("the reverse String "+s+" is : "+stringReverse(s));
		
	}

}
