package com.ajacs.arrayprograms2305.programs2705;

import java.util.Arrays;

public class CommonEleArrays {
	private static int[] commonElementsReturn(int[] arr1,int[] arr2) {
		String s="";
		Arrays.sort(arr1);
		for(int i=0;i<arr1.length;i++) {
			if (i > 0 && arr1[i] == arr1[i - 1]) {
                continue;
            }
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    s += arr1[i] + " ";
                    break;
                }
            }
		}
		
		
		String[] sarr=s.split(" ");
		int[] ar=new int[sarr.length];
		for(int i=0;i<sarr.length;i++) {
			ar[i]= Integer.parseInt(sarr[i]);
		}
		
		return ar;
	}
	public static void main(String[] args) {
		int[] arr1= {1,3,2,4,2,4,7,43,4,68,2};
		int[] arr2= {1,0,0,2,0,0,0,0,0,2,68,2};
		System.out.println(Arrays.toString(commonElementsReturn(arr1,arr2)));
	}

}
