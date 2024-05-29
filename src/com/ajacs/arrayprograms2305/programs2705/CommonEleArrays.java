package com.ajacs.arrayprograms2305.programs2705;

import java.util.Arrays;

public class CommonEleArrays {
	private static void commonElementsReturn(int[] arr1,int[] arr2) {
		Arrays.sort(arr1);
		for(int i=1;i<arr1.length;i++) {
			if (arr1[i] != arr1[i - 1]) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j]) {
						System.out.println(arr1[i]);
						break;
						break;
					}
				}
            }
		}
	}
	public static void main(String[] args) {
		int[] arr1= {1,3,2,4,2,4,7,43,4,68,2};
		int[] arr2= {1,0,0,2,0,0,0,43,43,0,2,68,2};
		commonElementsReturn(arr1,arr2);
	}

}
