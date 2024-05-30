package com.ajacs.arrayprograms2305;


public class MaximumValue {
	public static String maxOfArray(int[] arr) {
		if ((arr.length==0) || (arr==null))
			return null;
		int max=0;
		int min=arr[0];
		for (int i : arr) {
			if (i>max)
				max=i;
			if (i<min)
				min=i;
		}
		return min+" "+max;
	}
	public static void main(String[] args) {
		int[] arr= {3,1,2,4,23,4,3,5,3,2,5,4,52};
		String[] minmax=maxOfArray(arr).split(" ");
		if (minmax!=null) {
			System.out.println("Min value in array is : "+Integer.parseInt(minmax[0]));
			System.out.println("Max value in array is : "+Integer.parseInt(minmax[1]));}
		else
			System.out.println("please give valid Array");
			
		
		
	}

}
