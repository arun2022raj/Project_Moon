package com.ajacs.arrayprograms2305;

import java.util.Arrays;

public class MergeTwoSorteArrays {
	public static int[] bettermerge(int[] a,int[] b) {
		int[] narr=new int[a.length+b.length];
		int i=0,j=0,k=0;
		
		while ((i<a.length) && (j<b.length)) {
			if (a[i]<b[j]) {
				narr[k++]=a[i++];
			}
			else {
				narr[k++]=b[j++];
			}
		}
		while (i< a.length) {
			narr[k++]=a[i++];
		}
		while(j<b.length) {
			narr[k++]=b[j++];
		}
		return narr;
	}
	
	public static int[] Mymerge(int[] a,int[] a1) {
		
		int[] narr=new int[a.length+a1.length];
		int itercount=0;
		for (int i=0;i<narr.length;i++) {
			itercount++;
			if (i>=a.length) {
				narr[i]=a1[i-(a.length)];
			}
			else
				narr[i]=a[i];
		}
		System.out.println(itercount);
		Arrays.sort(narr);
		return narr;
		
	}
	
	public static void main(String[] args) {
		int[] arr=  {1,2,3,4,5,5,5,5,5};
		int[] arr1= {5,6,7,8,9};
		System.out.println(Arrays.toString(Mymerge(arr,arr1)));
		System.out.println(Arrays.toString(bettermerge(arr,arr1)));
		

		
	}

}
