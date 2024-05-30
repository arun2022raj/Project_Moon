package com.ajacs.encapsulationex;

public class EmployeeCreater {
	public static void main(String[] args) {
		Employee emp1=new Employee();
		System.out.println(emp1.getId());
		emp1.setId("AJA1092");
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		emp1.setName("JAKKAM ARUN RAJESH");
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		emp1.setSalary(1_00_00_000.0077);
		System.out.println(emp1.getSalary());
		
		
	}

}
