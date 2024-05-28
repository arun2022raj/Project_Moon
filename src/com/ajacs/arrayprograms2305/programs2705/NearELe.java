package com.ajacs.arrayprograms2305.programs2705;

public class NearELe {
	public static String nearEle(int[] arr,int ele) throws ArrayIndexOutOfBoundsException {
		int firstindex=-1;
		int lastindex=-1;
		int i=0,j=arr.length-1;
		while (true){
			if (firstindex==-1)
				if (arr[i]==ele) {
					firstindex=i;
				}
			if (lastindex==-1)
				if (arr[j]==ele) {
					lastindex=j;
				}
			i++;
			j--;
			if ((lastindex!=-1) && (firstindex!=-1))
				break;
		}
		return "firstindex : "+firstindex+" "+"lastindex : "+lastindex;
		
	}
	public static void main(String[] args) {
		int[] arr= {4,5,6,7,7,5};
		try {
		System.out.println(nearEle(arr,3));
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Element not found");
		}
		
	}

}
