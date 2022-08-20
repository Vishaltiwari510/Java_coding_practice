package com.stackroute.session.oops20April;

public class Car {
 
	
	String model;
	int manufacturingYear;
	double onRoadPrice;
	String color;
	byte noOfSeats;
	short engineCC;
	String carType;
	byte airbags;
	String fuelType;
	
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Car is called");
	}
	
	
	
	

	public Car(String model, int manufacturingYear, double onRoadPrice, String color, byte noOfSeats, short engineCC,
			String carType, byte airbags, String fuelType) {
		
		this.model = model;
		this.manufacturingYear = manufacturingYear;
		this.onRoadPrice = onRoadPrice;
		this.color = color;
		this.noOfSeats = noOfSeats;
		this.engineCC = engineCC;
		this.carType = carType;
		this.airbags = airbags;
		this.fuelType = fuelType;
	}
	
	
	public void displayCar() {
		System.out.println("Function in base class is called by derived class instance");
		System.out.println("Model : "+model);
	}
	
}
