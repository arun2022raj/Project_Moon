package com.ajacs.stringtask1006;

public class StringPermutation {
	static int c;
	public static void permute(String str,int l,int r) {
		 	if(l==r) {
		 		System.out.println(str);
		 		c++;
		 	}
		 	else {
		 		for(int i=l;i<=r;i++) {
		 			str= swap(str,l,i);
		 			permute(str,l+1,r);
		 			str = swap(str, l, i);
		 		}
		 	}
	}
	public static String swap(String a,int i,int j) {
		char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray);
	}
	public static void main(String[] args) {
		String s="a";
		permute(s,0,s.length()-1);
		System.out.println(c);
	}
}
