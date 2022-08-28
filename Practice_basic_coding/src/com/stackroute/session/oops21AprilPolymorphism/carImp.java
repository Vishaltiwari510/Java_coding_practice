package com.stackroute.session.oops21AprilPolymorphism;

public class carImp {

	public static void main(String[] args) {
	
		Car car = new Car(34234.54, 2022);
		car.displayCar();
		System.out.println("-----------------------------------");
		car.displayCar(2022);
		System.out.println("-----------------------------------");
		BMW bmw = new BMW(34234.54, 2022, "BMWX1");
		bmw.displayCar();
		System.out.println("-----------------------------------");
		bmw.displayCar(2022);
		System.out.println("-----------------------------------");
		bmw.displayCar("bmw x1");

	}

}
