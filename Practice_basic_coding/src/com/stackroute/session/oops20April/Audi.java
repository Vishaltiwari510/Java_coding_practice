package com.stackroute.session.oops20April;

public class Audi extends Car {

	
	boolean isFourWheelAllowed;

	public Audi(String model, int manufacturingYear, double onRoadPrice, String color, byte noOfSeats, short engineCC,
			String carType, byte airbags, String fuelType, boolean isFourWheelAllowed) {
		super(model, manufacturingYear, onRoadPrice, color, noOfSeats, engineCC, carType, airbags, fuelType);
		this.isFourWheelAllowed = isFourWheelAllowed;
	}
	
	public void displayAudi() {
		System.out.println("function in derived class is called by same derived class object");
		System.out.println("Model : "+model);
		System.out.println("Four wheel drive is allowed or not : "+isFourWheelAllowed);
	}
}
