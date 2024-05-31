package com.ajacs.strings;

import java.util.Arrays;

public class SortString {
	
	public static void main(String[] args) {
		String s="behfuivbnjcnbvhcnj";
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch).replaceAll("[\\[,\\], ]",""));
	}

}
