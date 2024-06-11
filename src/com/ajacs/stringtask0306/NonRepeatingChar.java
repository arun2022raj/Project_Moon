package com.ajacs.stringtask0306;

public class NonRepeatingChar {
	public static Character nonRepeatingChar(String s) {
		int c=0;
		for (int i=0;i<s.length();i++) {
			c=0;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					c++;
					break;
				}
			}
			if (c==0)
				return s.charAt(i);
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		String s="abcdefghijkabcdeghijk";
		System.out.println(nonRepeatingChar(s));
		
	}

}
