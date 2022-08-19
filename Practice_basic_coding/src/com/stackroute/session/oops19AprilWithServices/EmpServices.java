package com.stackroute.session.oops19AprilWithServices;

public class EmpServices {
	public void displayEmp(Emp emp) {
		System.out.println("Employee id: "+ emp.id);
		System.out.println("Employee name: "+ emp.name);
		
		 DepartmentServices departmentServices = new DepartmentServices();
         departmentServices.displayDepartment(emp.department);
	}
	
}
