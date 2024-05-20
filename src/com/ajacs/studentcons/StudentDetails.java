package com.ajacs.studentcons;

public class StudentDetails {
	public static void main(String[] args) {
		Student s1=new Student("22691F007");
		System.out.println(s1.id+" "+s1.name+" "+s1.age);
		Student s2 = new Student("22691f0007","jakkam");
		System.out.println(s2.id+" "+s2.name+" "+s2.age);
		Student s3 = new Student("22691f0007","jakkam",24);
		System.out.println(s3.id+" "+s3.name+" "+s3.age);

	}

}
