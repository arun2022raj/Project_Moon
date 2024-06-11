package com.ajacs.stringtask1006;

import java.util.Arrays;

public class LargestCommonPrefix {
	public static void main(String[] args) {
		String[] s = { "listen", "list", "lister", "listing" };
		Arrays.sort(s);
		int i=0;
		String first=s[0];
		String last=s[s.length-1];
		while (i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)) {
			i++;
		}
		String prefix="";
		for(int j=0;j<i;j++) {
			prefix+=last.charAt(j);
		}
		System.out.println(prefix);

	}
}
