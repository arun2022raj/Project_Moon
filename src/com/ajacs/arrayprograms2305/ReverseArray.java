package com.ajacs.arrayprograms2305;

import java.util.Arrays;

public class ReverseArray {
	public static int[] reverseArray(int[] arr) {
		if ((arr.length==0) || (arr==null))
			return null;
		int len=arr.length;
		int temp;
		for (int i=0;i<(len/2);i++) {
			temp=arr[i];
			arr[i]=arr[len-i-1];
			arr[len-i-1]=temp;			
		}
		return arr;
		
	}
	public static void main(String[] args) {
		int[] arr= {3,1,2,4,23,4,3,5,3,2,5,4,52};
		int[] rarr=reverseArray(arr);
		
		if (rarr!=null)
			System.out.println("Max value in array is : "+Arrays.toString(rarr));
		else
			System.out.println("please give valid Array");
		
		
	}

}
