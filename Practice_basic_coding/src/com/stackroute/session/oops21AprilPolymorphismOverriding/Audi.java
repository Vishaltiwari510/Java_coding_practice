package com.stackroute.session.oops21AprilPolymorphismOverriding;

public class Audi extends Car{

	public boolean isFourWheelDriveAvailable;

	public Audi(double price, int manufacturingYear, boolean isFourWheelDriveAvailable) {
		super(price, manufacturingYear);
		this.isFourWheelDriveAvailable = isFourWheelDriveAvailable;
	}
	
	 public void displayCarInfo() {
		 // This is concept of method overriding
		 super.displayCarInfo();
		 System.out.println("Four wheel drive is available  : "+ isFourWheelDriveAvailable);
	 }
	
}
