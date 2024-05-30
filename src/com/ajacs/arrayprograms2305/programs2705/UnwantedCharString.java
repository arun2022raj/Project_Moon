package com.ajacs.arrayprograms2305.programs2705;

import java.util.Arrays;

public class UnwantedCharString {
	private static String[] name(String[] arr,String regex) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i].replaceAll(regex, "");
		}
		return arr;
	}
	public static void main(String[] args) {
		String[] arrs= {"arun123","rajesh456","jakkam789"};
		System.out.println(Arrays.toString(name(arrs,"[1,2,3]")));
	}

}
