package com.ajacs.arrayprograms2305;

public class DuplicateEle {
	public static boolean duplicate(int[] arr) {
		for (int i=0;i<arr.length;i++)
			for (int j=i+1;j<arr.length;j++)
				if (arr[i]==arr[j])
					return false;
		return true;
	}
	public static void main(String[] args) {
		int[] arr= {3,1,2,4,23,4,3,5,3,2,5,4,52};
		System.out.println("is array contain duplicate elements : "+duplicate(arr));
		
		
	}
}
