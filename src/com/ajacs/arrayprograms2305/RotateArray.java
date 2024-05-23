package com.ajacs.arrayprograms2305;

import java.util.Arrays;

public class RotateArray {
	public static int[] rot(int[] arr,int ele) {
		int[] arr1= Arrays.copyOfRange(arr, arr.length-ele-1, arr.length);
		int[] arr2=Arrays.copyOfRange(arr, 0, arr.length-ele-1);
		int[] narr=new int[arr.length];
		for (int i=0;i<narr.length;i++) {
			if (i>=arr1.length) {
				narr[i]=arr2[i-(arr1.length)];
			}
			else
				narr[i]=arr1[i];
		}
		return narr;
	}
	
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(rot(arr,2)));
		
	}

}
