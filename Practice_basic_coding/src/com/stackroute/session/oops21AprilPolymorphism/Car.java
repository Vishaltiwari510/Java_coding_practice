package com.stackroute.session.oops21AprilPolymorphism;

public class Car {
    double price;
    int manufacturingYear;
    
    
    
	public Car(double price, int manufacturingYear) {
		
		this.price = price;
		this.manufacturingYear = manufacturingYear;
	}
    // Concept of method Overloading
    public void displayCar() {
    	System.out.println("Price : "+ price);
    	System.out.println("Manufacturing Year : " + manufacturingYear);
    }
    public void displayCar(int manufacturingYear) {
    	
    	System.out.println("Manufacturing Year : " + manufacturingYear);
    }
}
