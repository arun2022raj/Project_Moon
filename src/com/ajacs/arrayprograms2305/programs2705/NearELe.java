package com.ajacs.arrayprograms2305.programs2705;

public class NearEle {
	public static Integer nearestEle(int[] arr,int ele) {
		int minDiff=Math.abs(arr[0]-ele);
		Integer req1=arr[0];
		for(int i=1;i<arr.length;i++) {
			int diff=Math.abs(arr[i]-ele);
			if (diff<minDiff) {
				minDiff=diff;
				req1=arr[i];
			}
			
		}
		return req1;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,4,3,4,6,46,8,6,7,8,76,4,4,7};
		System.out.println(nearestEle(arr,24));
		
		
	}

}
