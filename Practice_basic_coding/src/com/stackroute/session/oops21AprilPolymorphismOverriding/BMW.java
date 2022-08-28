package com.stackroute.session.oops21AprilPolymorphismOverriding;

public class BMW extends Car {
	 String model;

	 public BMW(double price, int manufacturingYear, String model) {
	 	super(price, manufacturingYear);
	 	this.model = model;
	 }
	    
	 public void displayCarInfo() {
		 // This is concept of method overriding
		 super.displayCarInfo();
		 System.out.println("Car Model Number : "+ model);
	 }
//	 public void displayCar(String model) {
//	 	
//	 	System.out.println("Model of BMW Car : " + model);
//	 }
}
