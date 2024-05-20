package com.ajacs.studentcons;

public class Student {
	String id;
	String name;
	int age;
	Student(String id){
		this.id=id;
	}
	Student(String id,String name){
		this.id=id;
		this.name=name;
	}
	Student(String id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
