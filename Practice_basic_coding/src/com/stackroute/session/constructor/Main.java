package com.stackroute.session.constructor;

import com.stackroute.session.constructor.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// passing data for argument constructor
		Employee employee;
		employee = new Employee("emp1", 111, "development", (byte) 35, "emp1@gmail.com", (short) 2015, 45453.45,
				4533.56, 32342.45, 23424.5, 'M', true);
		// 1.value can be defined inside main as well as by creating a no-argument
		// character
		// but in case of no-argument character all object pointing to the constructor
		// give same result
		// but in main we can define values based on object name

		// 2. In case we define No-argument constructor, default constructor will not be
		// called by JVM

//	      employee.id = 101;
//	      employee.name = "Vishal";
//	      employee.age = 25;
//	      employee.basicSalary = 43423.56;
//	      employee.hra = 4545;
//	      employee.ta = 534;
//	      employee.joiningYear = 2015;

		// EmpsName total salary is 45453
		System.out.println(employee.name + "'s total salary is " + employee.calculateTotalSalary());

		// This will take data from No-argument constructor
		Employee employee2;
		employee2 = new Employee();
		System.out.println(employee2.name + "'s total salary is " + employee2.calculateTotalSalary());

		// Printing static data
		System.out.println(Employee.organization);
		System.out.println(Employee.officeContactNo);

		// object can also access and change static data but there is some problem with
		// data

		employee.organization = "Stackroute";
		System.out.println(employee.organization);

		// It changes value for all instance of class or for all objects
		System.out.println(employee2.organization);

		// It also changes value for class
//		System.err.println(Employee.organization);
		
// To fix the value, so that it does not change we can use final keyword while declaring
		System.out.println(Employee.OFFICE_EMAIL);
		
		// While modifying it shows error and ask to remove final
//		employee.OFFICE_EMAIL = "stack@gmail.com";

		
	  // calling static function using class name
		Employee.displayOrganizationDetails();
	}

}
