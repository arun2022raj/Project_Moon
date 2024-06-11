package com.ajacs.stringtask0306;

public class CountVowels {
	public static int vowelCount(String s) {
		String v="AEIOUaeiou";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(v.contains(s.charAt(i)+"")) {
				count++;
			}
		}
		return count;	
	}
	
	public static void main(String[] args) {
		String s="AIOUaiou";
		System.out.println(vowelCount(s));
		
	}

}
