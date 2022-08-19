package com.stackroute.session.oops19AprilWithServices;

public class DepartmentServices {
	public void displayDepartment(Department department) {
		System.out.println("Department id: "+department.id);
		System.out.println("Name: "+department.name);
		System.out.println("Department location: "+department.location);
		System.out.println("Department Manager: "+department.manager);
	}
}
