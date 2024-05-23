package com.ajacs.arrayprograms2305;



public class SecondLargest {
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
		int[] arr= {3,1,2,4,4,3,5,3,2,5,4,52,52};
		System.out.println(sec(arr));
	}

}
