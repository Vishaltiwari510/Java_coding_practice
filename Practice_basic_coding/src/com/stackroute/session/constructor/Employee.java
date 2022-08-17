package com.stackroute.session.constructor;

public class Employee {
	// state (data)
	String name;
	int id;
	String department;
	double salary;
	byte age;
	String email;
	short joiningYear;
	double basicSalary;
	double grossSalary;
	double hra;
	double ta;
	char gender;
	boolean isRegular;
	static String organization = "Wipro";
	static String officeContactNo = "91-9434534342";
    static final String OFFICE_EMAIL = "wipro@gmail.com";
    
//	no-arg constructor
	 Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee constructor is called");
		  id = 101;
	      name = "Vishal";
	      age = 25;
	      basicSalary = 43423.56;
	      grossSalary = 453356;
	      hra = 4545;
	      ta = 534;
	      joiningYear = 2015;
	}
	 
	 
	 
// Argument-Constructor
	 
	 public Employee(String name, int id, String department, byte age, String email, short joiningYear,
				double basicSalary, double grossSalary, double hra, double ta, char gender, boolean isRegular) {
			super();
			//this.instanceVariable = localVariable (defined in arg - constructor)
			this.name = name;
			this.id = id;
			this.department = department;
			this.age = age;
			this.email = email;
			this.joiningYear = joiningYear;
			this.basicSalary = basicSalary;
			this.grossSalary = grossSalary;
			this.hra = hra;
			this.ta = ta;
			this.gender = gender;
			this.isRegular = isRegular;
		}

	 
	 
	 
	 
	 
	 
	 
	 
	// all the employee from a department
	// sort all the employee based on name
	// all the employee who are in the age group of 30 to 40
	// all female employee
	// all the employee who are regular
	// calculate the total salary of the employee
	// give the average salary of product management of employee

	// calculate the total salary of Employee
	double calculateTotalSalary() {
		return basicSalary + grossSalary + hra + ta;
	}

	


	// calculate the experience of an employee

	byte experienceOfEmployee(){
	   short currentYear = 2022;
	   return (byte) (currentYear- joiningYear);
	   
   }
	
	static void displayOrganizationDetails() {
		System.out.println("Organizationo name -> " + organization);
		System.out.println("Organization contact Number -> "+ officeContactNo);
		System.out.println("Organization office email id -> "+OFFICE_EMAIL);
	}

}
