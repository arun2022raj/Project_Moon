package com.ajacs.arrayprograms2305;

import java.util.Arrays;

public class MergeTwoSorteArrays {
	public static int[] merge(int[] a,int[] a1) {
		
		int[] narr=new int[a.length+a1.length];
		for (int i=0;i<narr.length;i++) {
			if (i>=a.length) {
				narr[i]=a1[i-(a.length)];
			}
			else
				narr[i]=a[i];
		}
		Arrays.sort(narr);
		return narr;
		
	}
	
	public static void main(String[] args) {
		int[] arr=  {1,2,3,4};
		int[] arr1= {5,6,7,8,9};
		System.out.println(Arrays.toString(merge(arr,arr1)));
		

		
	}

}
