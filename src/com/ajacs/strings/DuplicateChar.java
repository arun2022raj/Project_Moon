package com.ajacs.strings;

public class DuplicateChar {
	
	private static StringBuffer duplicateChar(String s) {
		StringBuffer t=new StringBuffer();
		for (int i=0;i<s.length();i++) {
			for (int j=i+1;j<s.length();j++) {
				if (s.charAt(i)==s.charAt(j)) {
					System.out.println(s.charAt(i));
					t.append(s.charAt(i)+" ");
				}
			}
		}
		return t;	
	}
	private static StringBuffer duplicateChar1(String s) {
		StringBuffer t=new StringBuffer();
		for (int i=0;i<s.length();i++) {
			for (int j=i+1;j<s.length();j++) {
				if (s.charAt(i)==s.charAt(j) && t.indexOf(s.charAt(i)+"")==-1) {
					System.out.println(s.charAt(i));
					t.append(s.charAt(i)+" ");
				}
			}
		}
		return t;	
	}
	
	public static void main(String[] args) {
		duplicateChar("jakkam");	
		
		
	}

}
