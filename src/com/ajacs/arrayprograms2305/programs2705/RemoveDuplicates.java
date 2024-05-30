package com.ajacs.arrayprograms2305.programs2705;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void removeDuplicates1(int[] arr) {
		
		for (int i=0;i<arr.length;i++) {
			int c=0;
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					c=1;
					break;
				}
			}
			if (c==0)
				System.out.print(arr[i]+" ");
		}
	}
	
	public static void removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		System.out.print(arr[0] + " ");
		for (int i=1;i<arr.length;i++) {
			if (arr[i]!=arr[i-1]) {
				System.out.print(arr[i]+" ");
			}
		}		
	}
	public static void main(String[] args) {
		
		int[] arr= {0,1,44,22,44,5,33,33,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,1};
		removeDuplicates(arr);
		System.out.println();
		removeDuplicates1(arr);
		
	}

}
