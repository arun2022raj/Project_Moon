package com.ajacs.strings;

public class VowelsConsonants {
	public static void main(String[] args) {
		String s="I am proud to be Indian";
		String v="AEIOUaeiou";
		StringBuffer vowels=new StringBuffer();
		StringBuffer consonants=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			if ((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=65 && s.charAt(i)<=90)) {
				if (v.indexOf(s.charAt(i))==-1) {
					vowels.append(s.charAt(i)+" ");
				}
				else {
					consonants.append(s.charAt(i)+" ");
				}
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
	}

}
