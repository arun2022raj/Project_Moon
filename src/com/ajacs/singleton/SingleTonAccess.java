package com.ajacs.singleton;

public class SingleTonAccess {
	public static void main(String[] args) {
		System.out.println("Hello World");
		SingleTon s1=SingleTon.getInstance();
		System.out.println(System.identityHashCode(s1));
		SingleTon s2=SingleTon.getInstance();
		System.out.println(System.identityHashCode(s2));
		System.out.println(SingleTon.objcount());
//		AccessSingleTon.m1();
		
	}

}
