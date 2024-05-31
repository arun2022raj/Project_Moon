package com.ajacs.strings;

public class StringCompress {
	
	public static void main(String[] args) {
		String s="aaaaabbaaccc";
		int c=1;
		String s1="";
		for(int i=1;i<s.length();i++) {
			if (s.charAt(i)==s.charAt(i-1)) {
				c++;
			}
			else {
				s1+=s.charAt(i-1)+""+c;
				c=1;
			}
		}
		s1 += s.charAt(s.length() - 1) + "" + c;
		System.out.println(s1);
	}
}
