package com.stackroute.session.oops19April;

public class Department {

	int id;
	String name;
	String location;
	String manager;
	
	
	
	
	public Department(int id, String name, String location, String manager) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.manager = manager;
	}
	
	
	public void displayDepartment() {
		System.out.println("Department id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Department location: "+location);
		System.out.println("Department Manager: "+manager);
	}
	
	
	
	
	
	
	
}
