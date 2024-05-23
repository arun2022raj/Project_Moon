package com.ajacs.arrayprograms2305;

import java.util.Arrays;

public class RemoveEle {
	public static int[] rem(int[] arr,int ele) {
		int c=0;
		for(int i:arr) 
			if (i==ele)
				c++;
		int[] narr=new int[arr.length-c];
		int j=0;
		for (int i:arr) {
			if (i!=ele) {
				narr[j]=i;
				j++;
			}
		}
		return narr;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {3,1,2,4,23,4,3,5,3,2,5,4,52};
		System.out.println(Arrays.toString(rem(arr,3)));

		
	}

}
