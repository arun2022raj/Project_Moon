package com.ajacs.stringtask1006;

import java.util.Arrays;

public class AnogramCheck {
	public static void main(String[] args) {
		String s="listen";
		String s1="silent";
		char[] c=s.toCharArray();
		char[] c1=s1.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		if (Arrays.equals(c, c1)) {
			System.out.println("given words are anogram");
		}
		else {
			System.out.println("given words are not anogram");
		}
	}

}
