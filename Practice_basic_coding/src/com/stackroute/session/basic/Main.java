package com.stackroute.session.basic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Employee employee;
      employee = new Employee();
      // 1.value can be defined inside main as well as by creating a no-argument character
      // but in case of no-argument character all object pointing to the constructor give same result
      // but in main we can define values based on object name
      
      // 2. In case we define No-argument constructor, default constructor will not be called by JVM
      
      employee.id = 101;
      employee.name = "Vishal";
      employee.age = 25;
      employee.basicSalary = 43423.56;
      employee.hra = 4545;
      employee.ta = 534;
      employee.joiningYear = 2015;
      
      // EmpsName total salary is 45453
      System.out.println(employee.name + "'s total salary is " + employee.calculateTotalSalary());
    		  
	}

}
