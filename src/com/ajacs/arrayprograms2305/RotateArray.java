package com.ajacs.arrayprograms2305;

import java.util.Arrays;

public class RotateArray {
	public static int[] rot1(int[] arr,int ele) {
		int[] narr=new int[arr.length];
		int j=0;
		for(int i=arr.length-ele;i<arr.length;i++) {
			narr[j]=arr[i];
			j++;
		}
		for(int i=0;i<arr.length-ele;i++) {
			narr[j]=arr[i];
			j++;
		}
		return narr;
	}
	
	public static int[] rot(int[] arr,int ele) {
		int[] arr1= Arrays.copyOfRange(arr, arr.length-ele, arr.length);
		int[] arr2=Arrays.copyOfRange(arr, 0, arr.length-ele);
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
		System.out.println(Arrays.toString(rot1(arr,2)));
		
	}

}
