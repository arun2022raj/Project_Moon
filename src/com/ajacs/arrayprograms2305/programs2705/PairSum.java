package com.ajacs.arrayprograms2305.programs2705;


public class PairSum {
	public static void pairSum(int[] arr, int sum) {
		int k=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (sum==arr[i]+arr[j])
					System.out.println("pair "+ (++k)+" is "+"["+ arr[i]+","+arr[j]+"]");
			}
		}	
	}
	public static void main(String[] args) {
		pairSum(new int[] {2,1,2,4,5,6,64,3,5,6754,34,65,678,7,53,0,6675,5,3,35,7,7},3);
	}
}
