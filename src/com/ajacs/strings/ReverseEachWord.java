package com.ajacs.strings;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s="be proud to be inidan";
		String n="";
		String n1="";
		for(String w:s.split(" ")) {
			n+=""+new StringBuffer(" "+w).reverse();
			for(int i=w.length()-1;i>=0;i--) {
				n1+=w.charAt(i);
			}
			n1+=" ";
		}
		System.out.println(n);
		System.out.println(n1);
	}
}
