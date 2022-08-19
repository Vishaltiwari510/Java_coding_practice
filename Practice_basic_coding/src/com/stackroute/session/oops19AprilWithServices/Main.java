package com.stackroute.session.oops19AprilWithServices;

import com.stackroute.session.oops19AprilWithServices.Department;
import com.stackroute.session.oops19AprilWithServices.Emp;

public class Main {

	public static void main(String[] args) {
		
		
		Department department = new Department(101, "Wipro", "Coimbatore", "RJ");
     
//         Emp emp = new Emp(111, "Vishal", department);
		
		Emp emp = new Emp(111, "vishal", department);
         
         EmpServices empServices = new EmpServices();
         empServices.displayEmp(emp);
         
        
         
         


	}

}
