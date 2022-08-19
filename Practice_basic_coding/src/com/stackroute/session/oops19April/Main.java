package com.stackroute.session.oops19April;

public class Main {

	public static void main(String[] args) {
	
		Department department = new Department(101, "Wipro", "Coimbatore", "Project");
		
		Emp emp = new Emp(111, "Vishal", department);
		
	   emp.displayEmp();

	}

}
