package com.ajacs.arrayprograms2305.programs2705;

public class MissingNumber {
	public static int  missingNumber(int[] arr) {
		int miss=0;
		int n=arr.length;
		int sum=(n*(n+1))/2;
		int total=0;
		for (int i=0;i<arr.length;i++) {
			total+=arr[i];
		}
		miss=sum-total;
		return miss;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2};
		System.out.println(missingNumber(arr));
		
	}

}
