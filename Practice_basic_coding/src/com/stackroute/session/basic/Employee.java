package com.stackroute.session.basic;

// session - 2    14 April
public class Employee {
	// state (data)
	public String name;
	public int id;
	String department;
	double salary;
	public byte age;
	String email;
	public short joiningYear;
	public double basicSalary;
	double grossSalary;
	public double hra;
	public double ta;
	char gender;
	boolean isRegular;

//	no-arg constructor
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee constructor is called");
	}
	// all the employee from a department
	// sort all the employee based on name
	// all the employee who are in the age group of 30 to 40
	// all female employee
	// all the employee who are regular
	// calculate the total salary of the employee
	// give the average salary of product management of employee

	// calculate the total salary of Employee
	public double calculateTotalSalary() {
		return basicSalary + grossSalary + hra + ta;
	}

	// calculate the experience of an employee

	byte experienceOfEmployee(){
	   short currentYear = 2022;
	   return (byte) (currentYear- joiningYear);
	   
   }

}
