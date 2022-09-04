package com.stackroute.session.collectionFrameworkMapImplementation4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.stackroute.session.collectionFrameworkMapImplementation3.Car;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Enter the name of car which details you want from showroom");
		String choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextLine();
		
		
		
		//RNS MOTORS-------------------------------------------
		Car car1 = new Car("swift", "black", "maruti");
		Car car2 = new Car("baleno", "black", "maruti");
		Car car3 = new Car("etios", "black", "toyota");
		
		
		
		//Nandi Motors-------------------------------------------
		Car car4 = new Car("glanza", "black", "toyota");
		Car car5 = new Car("safari", "black", "tata");
		Car car6 = new Car("tigor", "black", "tata");
		Car car7 = new Car("nexon", "black", "tata");
		
		
		
		
		
		//Storing car1, car2, car3, in showroom1
		Map<String, Car> cars1 = new HashMap<String, Car>();		
		cars1.put(car1.getName(), car1);
		cars1.put(car2.getName(), car2);
		cars1.put(car3.getName(), car3);	
		Showroom showroom1 = new Showroom("RNS MOTORS",cars1);
		
		
		//Storing car4, car5, car6, car7 in showroom2
		Map<String, Car> cars2 = new HashMap<String, Car>();		
		cars2.put(car4.getName(), car4);
		cars2.put(car5.getName(), car5);
		cars2.put(car6.getName(), car6);
		cars2.put(car7.getName(), car7);
		Showroom showroom2 = new Showroom("Nandi MOTORS",cars2);
		
		
		Car car = showroom2.searchCar(choice);
		
		
		
		if(car==null) {
			System.out.println("The car you search is not found");
		
			
//			System.out.println("Available cars are :\n "+showroom1+"\n"+showroom2+"");
	System.out.println("Available cars are : ");
			Map<String, Car> carsInS2 = showroom2.getCars();
			
			for(Entry<String, Car> s2Car : carsInS2.entrySet())
		System.out.println(s2Car.getValue());
		
		}
		else {
			System.out.println(car);
			
		}

	}

}
