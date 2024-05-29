package com.ajacs.arrayprograms2305.programs2705;

public class FirstIndexlastIndex {
	public static String firstIndexLastIndex(int ele,int[] arr) {
		if(arr.length==0 || arr==null)
			return null;
		int firstindex=-1;
		int lastindex=-1;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==ele) {
				if (firstindex==-1) {
					firstindex=i;
				}
				lastindex=i;
			}
		}
		return "firstindex : "+firstindex+" "+"lastindex : "+lastindex;
	}
//	public static String firstIndexLastIndex(int[] arr,int ele) throws ArrayIndexOutOfBoundsException {
//		if(arr.length==0 || arr==null)
//			return null;
//		int firstindex=-1;
//		int lastindex=-1;
//		int i=0,j=arr.length-1;
//		while (true){
//			if (firstindex==-1)
//				if (arr[i]==ele) {
//					firstindex=i;
//				}
//			if (lastindex==-1)
//				if (arr[j]==ele) {
//					lastindex=j;
//				}
//			i++;
//			j--;
//			if ((lastindex!=-1) && (firstindex!=-1))
//				break;
//		}
//		return "firstindex : "+firstindex+" "+"lastindex : "+lastindex;
//		
//	}
	public static void main(String[] args) {
		int[] arr= {4,5,6,7,7,5};
		try {
		System.out.println(firstIndexLastIndex(7,arr));
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Element not found");
		}
		
	}

}
