package com.stackroute.session.oops21AprilPolymorphism;

public class BMW extends Car {
   String model;

public BMW(double price, int manufacturingYear, String model) {
	super(price, manufacturingYear);
	this.model = model;
}
   
public void displayCar(String model) {
	
	System.out.println("Model of Car : " + model);
}
   
}
