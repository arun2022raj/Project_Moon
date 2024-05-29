package com.ajacs.arrayprograms2305.programs2705;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void removeDuplicates(int[] arr) {
		
		Arrays.sort(arr);;
		for (int i=1;i<arr.length;i++) {
			if (arr[i]!=arr[i-1]) {
				System.out.print(arr[i]+" ");
			}
		}		
	}
	public static void main(String[] args) {
		
		int[] arr= {0,0,1,44,22,44,5,33,33,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,1};
		removeDuplicates(arr);
		
	}

}
