package com.loopexam;

public class ReverseNumber {
	public static int withoutLoop(int num) {
		String s= String.valueOf(num);
		return Integer.parseInt(String.valueOf(new StringBuffer(s).reverse()));
		
	}
	public static int forReverse(int num) {
		// TODO Auto-generated method stub
		int revNum=0;
		for(int rem=0;num!=0;num=num/10) {
			rem=num%10;
			revNum=(revNum*10)+rem;
		}
		return revNum;
	}
	public static int whileReverse(int num) {
		int rem=0;
		int revNum=0;
		while (num!=0) {
			rem=num%10;
			revNum=(revNum*10)+rem;
			num=num/10;
		}
		return revNum;
	}
	public static int doReverse(int num) {
		int rem=0;
		int revNum=0;
		do {
			rem=num%10;
			revNum=(revNum*10)+rem;
			num=num/10;
		}while(num!=0);
		return revNum;
		
	}
	
	public static void main(String[] args) {
		int revnum=forReverse(123);
		System.out.println("reversed number with for loop : "+revnum);
		revnum=whileReverse(123);
		System.out.println("reversed number with while loop : "+revnum);
		revnum=doReverse(123);
		System.out.println("reversed number with do while loop : "+revnum);
		revnum=withoutLoop(123);
		System.out.println("reversed number with out loop : "+revnum);

	}

}
