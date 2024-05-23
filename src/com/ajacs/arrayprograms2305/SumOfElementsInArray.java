package com.ajacs.arrayprograms2305;



public class SumOfElementsInArray {
	public static Integer sumOfElements(int[] arr) {
		if ((arr.length==0) || (arr==null))
			return null;
		int sum=0;
		for (int i:arr) {
			sum+=i;
		}
		
		
		return sum;
	}
	public static void main(String[] args) {
		int[] arr= {3,1,2,4,23,4,3,5,3,2,5,4,52};
		Integer sum=sumOfElements(arr);
		if (sum!=null)
			System.out.println("Max value in array is : "+sum);
		else
			System.out.println("please give valid Array");
		
		
	}

}
