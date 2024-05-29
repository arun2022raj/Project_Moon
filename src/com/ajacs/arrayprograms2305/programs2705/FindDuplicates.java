package com.ajacs.arrayprograms2305.programs2705;

import java.util.Arrays;

//finding duplicates in single arrays

public class FindDuplicates {
	public static void findDuplicates(int[] arr) {
		Arrays.sort(arr);
		int contain=-1;
		for(int i=1;i<arr.length;i++) {
			if  (contain!=arr[i] && arr[i]==arr[i-1] )	 {
				System.out.println(arr[i]);
				contain=arr[i];
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {2,1,2,4,5,6,7,8,6,0,0,2,79,79};
		findDuplicates(arr);		
	}

}
