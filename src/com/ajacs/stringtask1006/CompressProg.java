package com.ajacs.stringtask1006;

public class CompressProg {
	public static void main(String[] args) {
		String s="aaabbbcccffftt";
		String snew="";
		int c=1;
		int i=0;
		for(i=1;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(i-1)) {
				snew+=s.charAt(i-1)+""+c;
				c=1;
			}
			else {
				c++;
			}
		}
		snew+=s.charAt(i-1)+""+c;
		System.out.println(snew);
	}

}
