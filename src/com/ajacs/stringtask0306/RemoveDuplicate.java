package com.ajacs.stringtask0306;

public class RemoveDuplicate {
	public static String removeDuplicate1(String s) {
		String rs="";
		for(int i=0;i<s.length();i++) {
			if(!rs.contains(s.charAt(i)+"")) {
				rs+=s.charAt(i);
			}
		}
		return rs;
	}
	
	
	
	
	
	
	
	
	
	private static String removeDuplicate(String s) {
		String rs="";
		int c=0;
		for(int i=0;i<s.length();i++) {
			c=0;
			for(int j=i+1;j<s.length();j++) {
				if (s.charAt(i)==s.charAt(j)) {
					c++;
					break;
				}	
			}
			if (c==0) {
				rs+=s.charAt(i);
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
		return rs;
		
	}
	
	
	public static void main(String[] args) {
		String s="programming";
		System.out.println(removeDuplicate1(s));
		
		
	}

}
