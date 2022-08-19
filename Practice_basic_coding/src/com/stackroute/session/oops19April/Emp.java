package com.stackroute.session.oops19April;

public class Emp {
	int id;
	String name;
	Department department;
	
	
	
	
	public Emp(int id, String name, Department department) {
		
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	
	public void displayEmp() {
		System.out.println("Employee id: "+ id);
		System.out.println("Employee name: "+ name);
	     department.displayDepartment();
	}
	
	
	
}
