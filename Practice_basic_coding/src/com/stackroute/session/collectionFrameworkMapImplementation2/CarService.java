package com.stackroute.session.collectionFrameworkMapImplementation2;

import java.util.HashMap;
import java.util.Map;

public class CarService {

	Map<String, Car> cars = new HashMap<>();
// Add car method is taking a carname of particular and its Cardetais using car argument
// and adding it to Map using put method as we were doing.
	void addCar(String carName, Car car) {
		cars.put(carName, car);
	}
	
//searchCar method is taking key (which is name here) as argument and returning 
//value (which is a Car here which gives car details) using getMethod;
Car	searchCar(String name) {
	return cars.get(name);
}
	
}
