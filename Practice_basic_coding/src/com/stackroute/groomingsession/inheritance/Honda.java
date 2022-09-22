package com.stackroute.groomingsession.inheritance;

public class Honda extends Bike {

	
	int bikeModel;
	 public String color;
	 
	public Honda() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Honda(int cc, int manufacturingYear, double onRoadPrice, int bikeModel, String color) {
		super(cc, manufacturingYear, onRoadPrice);
		this.bikeModel = bikeModel;
		this.color = color;
	}



	public void displayDetails() {
		System.out.println("Bike Model :  "+bikeModel);
		System.out.println("color : "+color);
	}



	@Override
	public String toString() {
		return "Honda [bikeModel=" + bikeModel + ", color=" + color + ", cc=" + cc + ", manufacturingYear="
				+ manufacturingYear + ", onRoadPrice=" + onRoadPrice + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	
	
}
