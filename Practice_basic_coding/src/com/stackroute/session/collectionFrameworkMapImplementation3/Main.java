package com.stackroute.session.collectionFrameworkMapImplementation3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Enter the car name you want to search details");
//			String choice;
//			Scanner sc = new Scanner(System.in);
//			choice = sc.nextLine();
					
		
		CarService carservice = new CarService();
//passing car details value of each type of car		
		Car car1 = new Car("swift", "black", "maruti");
		Car car2 = new Car("baleno", "black", "maruti");
		Car car3 = new Car("etios", "black", "toyota");
		Car car4 = new Car("glanza", "black", "toyota");
		Car car5 = new Car("safari", "black", "tata");
		Car car6 = new Car("tigor", "black", "tata");
		Car car7 = new Car("nexon", "black", "tata");

// here we are passing carname and car details as argument to addCar 
//which will add car details since addCar method implement put method.
		carservice.addCar(car1.getName(), car1);
		carservice.addCar(car2.getName(), car2);
		carservice.addCar(car3.getName(), car3);
		carservice.addCar(car4.getName(), car4);
		carservice.addCar(car5.getName(), car5);
		carservice.addCar(car6.getName(), car6);
		carservice.addCar(car7.getName(), car7);
		carservice.addCar(null, null);
//passing car name to searchCar method as key so that 
//using get method searchCar returns value using get method.
		
		Car car = carservice.searchCar("etios");
		//Avoiding exception using if statement
		if(car==null) {
			System.out.println("Car you search is not found....");
		}
		else
		System.out.println(car);
	
	}

}
