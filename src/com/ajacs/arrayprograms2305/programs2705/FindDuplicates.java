package com.ajacs.arrayprograms2305.programs2705;

import java.util.Arrays;

//finding duplicates in single arrays

public class FindDuplicates {
	public static int[] findDuplicates(int[] arr) {
		String s="";
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if (i>0 && arr[i]!=arr[i-1]) {
				continue;
			}
			else {
				s+=arr[i]+" ";
			}
		}
		String[] ars=s.split(" ");
		int[] ar=new int[ars.length];
		for(int i=0;i<ars.length;i++) {
			ar[i]= Integer.parseInt(ars[i]);
		}
		return ar;	
	}
	public static void main(String[] args) {
		int[] arr= {2,1,3,2,4,5,6,7,8,6,79,0,2};
		System.out.println(Arrays.toString(findDuplicates(arr)));
		
	}

}
