package com.ajacs.arrayprograms2305;

import java.util.Arrays;

public class FindEle {
	public static Integer binsearch(int[] arr,int target) {
		if ((arr.length==0) || (arr==null))
			return -1;
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==target)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {3,1,2,4,23,4,3,5,3,2,5,4,52};
		
		System.out.println("index of ele in array is : "+binsearch(arr,4));
		System.out.println(Arrays.toString(arr));
		
		
	}

}
