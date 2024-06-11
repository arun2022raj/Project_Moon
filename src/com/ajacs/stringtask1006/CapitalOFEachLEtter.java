package com.ajacs.stringtask1006;

public class CapitalOFEachLEtter {
	public static void main(String[] args) {
		String s= "First leTTeR of EACH Word";
		String snew=s.charAt(0)+"".toUpperCase();
		for(int i=1;i<s.length();i++) {
			if (s.charAt(i)==' ') {
				snew+=" "+((s.charAt(i+1)+"").toUpperCase());
			}
			else if(s.charAt(i-1)!=' ') {
				snew+=((s.charAt(i)+"").toLowerCase());
			}
		}
		System.out.println(snew);
	}
}
