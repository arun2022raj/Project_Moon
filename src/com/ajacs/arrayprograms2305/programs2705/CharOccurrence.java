
package com.ajacs.arrayprograms2305.programs2705;

public class CharOccurrence {
	public static int charOccurrence(char[] arr,char ele) {
		int c=0;
		for (int i=0;i<arr.length;i++) {
			if(ele==arr[i]) {
				c++;
				break;
			}
		}
		
		
		return c;
		
	}
	public static void main(String[] args) {
		char[] arr= {'a','s','d','d','e','f','g','u'};
		System.out.println(charOccurrence(arr,'d'));
	}

}
