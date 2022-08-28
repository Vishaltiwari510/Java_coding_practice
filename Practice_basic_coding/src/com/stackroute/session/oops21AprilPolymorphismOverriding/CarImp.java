package com.stackroute.session.oops21AprilPolymorphismOverriding;

import com.stackroute.session.oops21AprilPolymorphismOverriding.BMW;
import com.stackroute.session.oops21AprilPolymorphismOverriding.Car;

public class CarImp {

	public static void main(String[] args) {
		Car car = new Car(34234.54, 2022);
//		car.displayCarInfo();
		System.out.println("-----------------------------------");
//		car.displayCarInfo(2022);
		System.out.println("-----------------------------------");
		BMW bmw = new BMW(34234.54, 2022, "BMWX1");
//		bmw.displayCarInfo();
		System.out.println("-----------------------------------");
//		bmw.displayCarInfo(2022);
		System.out.println("-----------------------------------");
//		bmw.displayCarInfo("bmw x1");
        Audi audi = new Audi(545223.34, 2019, true);
        CarServices carServices = new CarServices();
        System.out.println("Car Information ------------");
        carServices.displayCar(car);
        System.out.println("BMW Information ------------");
        carServices.displayCar(bmw);
        System.out.println("Audi Information ------------");
        carServices.displayCar(audi);
        
        
        
        System.out.println("bmw1 can point to bmw -----------------------------------");
       BMW bmw1;
        bmw1 = bmw;
        System.out.println(bmw1.price);
        
        System.out.println("bmw can point to car -----------------------------------");
        Car car1;
        car1 = bmw;
        System.out.println(car1.price);
        
        System.out.println("but Car cannot point to BMW (gives error class cast exception)-----------------------------------");
        BMW bmw2;
        bmw2 = (BMW) car;
        System.out.println(bmw2.price);
	}

}
