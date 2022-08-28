package com.stackroute.session.oopsApril26and27JavaBeans;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee);  // gives Hashcode
		System.out.println(employee.getName()); //gives null
		employee.setId(101);
		employee.setName("Vishal");
		employee.setDepartment("Development");
		
		//Without overriding toString() methods
		
		
		System.out.println(employee.getId()); //gives - 101
		System.out.println(employee.getName()); //gives - Vishal
		System.out.println(employee.getDepartment());//gives - Development
		
		//After Overriding toString() methods
		//overriding methods allow to print object member data
		//without need to printing individually by just printing object name
		
		
		Employee employee2 = new Employee();
		employee2.setId(101);
		employee2.setName("Vishal");
		employee2.setDepartment("Development");
        System.out.println(employee2);
	}

}
