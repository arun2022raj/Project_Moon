package com.ajacs.arrayprograms2305;


public class MaximumValue {
	public static Integer maxOfArray(int[] arr) {
		if ((arr.length==0) || (arr==null))
			return null;
		int max=0;
		for (int i : arr) {
			if (i>max)
				max=i;
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr= {3,1,2,4,23,4,3,5,3,2,5,4,52};
		Integer max=maxOfArray(arr);
		if (max!=null)
			System.out.println("Max value in array is : "+max);
		else
			System.out.println("please give valid Array");
			
		
		
	}

}
