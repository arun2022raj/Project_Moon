package com.ajacs.arrayprograms2305;

import java.util.Arrays;

public class ZeroMove {
	public static int[] zeros(int[] arr,int ele) {
		int[] arr1=new int[arr.length];
		int j=0;
		for(int i:arr) {
			if (i!=ele) {
				arr1[j]=i;
				j++;
			}
		}
		while(j<arr.length) {
			arr1[j]=ele;
			j++;
		}
		return arr1;
		
	}
	public static void main(String[] args) {
		int[] arr= {3,5,0,7,4,0,6,3,5,0,76};
		System.out.println(Arrays.toString(zeros(arr,5)));
		
	}

}
