package com.ajacs.strings;

public class DuplicateWords {
	private static void duplicateWords(String s) {
		String[] s1=s.split(" ");
		for (int i=0;i<s1.length;i++) {
			for (int j=i+1;j<s1.length;j++) {
				if (s1[i].equals(s1[j]))
					System.out.println(s1[i]);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		duplicateWords("My name is jakkam arun rajesh , My name is vikram");
	}

}
