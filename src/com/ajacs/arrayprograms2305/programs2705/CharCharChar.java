package com.ajacs.arrayprograms2305.programs2705;

import java.util.Arrays;

public class CharCharChar {

	public static char[] chars(char[] arr,char ele) {
//		System.out.println(Arrays.toString(arr).replace("[","").replace("]","").replace(",","").replace(" ",""));
//		return Arrays.copyOfRange(arr, Arrays.toString(arr).replace("[","").replace("]","").replace(",","").replace(" ","").indexOf(ele)+1, arr.length);
		
		int index=-1;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				index=i;
				break;
			}
		}
		if (index==-1) {
			return new char[0];
		}
		return Arrays.copyOfRange(arr, index+1, arr.length);
		
		
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(chars(new char[] {'a','s','f','r','w','u'},'f')));
		
	}

}
