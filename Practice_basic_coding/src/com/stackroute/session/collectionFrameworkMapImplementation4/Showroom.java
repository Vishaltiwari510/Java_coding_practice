package com.stackroute.session.collectionFrameworkMapImplementation4;

import java.util.Map;

import com.stackroute.session.collectionFrameworkMapImplementation3.Car;

public class Showroom {
   String name;
   Map<String, Car> cars;
   
  
   Car	searchCar(String name) {
		return cars.get(name);
	}
   
   
//   void addCar(String carName, Car car) {
//		cars.put(carName, car);
//	}
   
   
   
   
   
   
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Map<String, Car> getCars() {
	return cars;
}
public void setCars(Map<String, Car> cars) {
	this.cars = cars;
}
   
   public Showroom() {
	
}
public Showroom(String name, Map<String, Car> cars) {
	super();
	this.name = name;
	this.cars = cars;
}
@Override
public String toString() {
	return "Showroom [name=" + name + "], [cars=" + cars + "]\n";
}
   
   
   
   
}
