package com.ajacs.singleton;

public class AccessSingleTon {
	
	    public static void m1(){
	        System.out.println("Hello World");
			SingleTon s1=SingleTon.getInstance();
			System.out.println(System.identityHashCode(s1));
			SingleTon s2=SingleTon.getInstance();
			System.out.println(System.identityHashCode(s2));
	    }
	    
	    public static void main(String[] args) {
			System.out.println("Hello World");
			SingleTon s1=SingleTon.getInstance();
			System.out.println(System.identityHashCode(s1));
			SingleTon s2=SingleTon.getInstance();
			System.out.println(System.identityHashCode(s2));
			AccessSingleTon.m1();
			System.out.println(SingleTon.objcount());

			
		}
	        
	    
}


