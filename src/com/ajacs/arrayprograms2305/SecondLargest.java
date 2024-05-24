package com.ajacs.arrayprograms2305;

import java.util.Arrays;

public class SecondLargest {
	public static Integer secNew(int[] a) {
		if (a.length<2) {
			return null;
		}
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--) {
			if (a[i-1]!=a[i]) {
				return a[i-1];
			}
		}
		return null;
		
	}
	
	public static Double sec(int[] arr) {
		Double f= Double.MIN_VALUE;
		Double s= Double.MIN_VALUE;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>f) {
				s=f;
				f=(double)arr[i];
			}
			if ((arr[i]>s) && (arr[i]!=f)) {
				s=(double)arr[i];
			}
		}
		return s;
	}
	public static void main(String[] args) {
		int[] arr= {3,1,2,4,4,3,5,3,2,23,23,5,4,52,52};
		System.out.println(sec(arr));
		System.out.println(secNew(arr));
	}

}
