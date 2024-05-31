package com.ajacs.strings;

import java.util.Arrays;

public class TwoStringAnagram {
	
	public static void main(String[] args) {
		String s="listen";
		String s1="silent";
		char[] c=s.toCharArray();
		char[] c1=s1.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c);
		System.out.println(Arrays.equals(c,c1));
	}
}
