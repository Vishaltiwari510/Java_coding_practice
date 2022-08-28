package com.stackroute.session.oops21AprilPolymorphismOverriding;

public class Car {
	  double price;
	    int manufacturingYear;
	    
	    
	    
		public Car(double price, int manufacturingYear) {
			
			this.price = price;
			this.manufacturingYear = manufacturingYear;
		}
	    
	    public void displayCarInfo() {
	    	System.out.println("Price of Car : "+ price);
	    	System.out.println("Manufacturing Year of Car : " + manufacturingYear);
	    }
	    public void displayCar(int manufacturingYear) {
	    	
	    	System.out.println("Car Manufacturing Year : " + manufacturingYear);
	    }
}
