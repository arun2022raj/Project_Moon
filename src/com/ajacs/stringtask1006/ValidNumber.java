package com.ajacs.stringtask1006;

public class ValidNumber {
	public static void main(String[] args) {
		String s="1s3";
		try {
			Double d=new Double(s);
//			Long d=Long.valueOf(s);
			System.out.println(d);
		}catch(NumberFormatException e) {
			System.out.println("its not a valid number");
		}
	}

}
