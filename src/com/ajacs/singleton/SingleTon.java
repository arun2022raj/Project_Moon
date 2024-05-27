package com.ajacs.singleton;

public class SingleTon {
	private static SingleTon s;
	private static int c;
	public SingleTon(){
		c++;
	}
    public static SingleTon getInstance(){
        if (s==null){
            s=new SingleTon();
            return s;
        }
        return s;
    }
    public static int objcount() {
    	return c;
    }

}
