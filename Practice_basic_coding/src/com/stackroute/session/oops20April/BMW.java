package com.stackroute.session.oops20April;

public class BMW extends Car {

	
	double maxDiscountPrice;
	
	public BMW() {
		// TODO Auto-generated constructor stub
		System.out.println("BMW is called");
	}

	public BMW(String model, int manufacturingYear, double onRoadPrice, String color, byte noOfSeats, short engineCC,
			String carType, byte airbags, String fuelType, double maxDiscountPrice) {
		super(model, manufacturingYear, onRoadPrice, color, noOfSeats, engineCC, carType, airbags, fuelType);
		this.maxDiscountPrice = maxDiscountPrice;
	}
	
	
	
	public void displayBMW() {
		System.out.println("function in derived class is called by same derived class object");
		System.out.println("Model : "+model);
		System.out.println("Maximum Discount Price : "+maxDiscountPrice);
	}
	
	
}
