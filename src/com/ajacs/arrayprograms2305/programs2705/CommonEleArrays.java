package com.ajacs.arrayprograms2305.programs2705;

import java.util.Arrays;

public class CommonEleArrays {
	private static void commonElementsReturn1(int[] arr1,int[] arr2) {
		for(int i=0;i<arr1.length;i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i]+" ");
					break;
				}
            }
		}
	}
	
	private static void commonElementsReturn(int[] arr1,int[] arr2) {
		Arrays.sort(arr1);
		for(int i=1;i<arr1.length;i++) {
			if (arr1[i] != arr1[i - 1]) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i-1] == arr2[j] ) {
						System.out.print(arr1[i-1]+" ");
						break;
					}
				}
            }
			
		}
	}
	public static void main(String[] args) {
		int[] arr1= {1,0,3,2,4,2,4,7,43,4,68,2};
		int[] arr2= {0,0,2,0,0,0,43,43,0,1,68,2,2};
		commonElementsReturn1(arr1,arr2);
		commonElementsReturn(arr1,arr2);
	}

}
