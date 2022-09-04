package com.stackroute.session.collectionFramework;

import java.util.concurrent.ArrayBlockingQueue;

public class collectionFrameworkLinkedlist2 {

	public static void main(String[] args) {
		//Difference between add and offer
		//ArrayBlockingQueue is  a class which redtrict the size of the queue
		// add and offer has different only when queue size is restricted or when
		//ArrayBlockingQueue is used.
		ArrayBlockingQueue<String> cities = new ArrayBlockingQueue<>(8);
		
		cities.add("Banglore");	
		cities.add("mumbai");	
		cities.add("chennai");	
		cities.add("delhi");	
		cities.add("kolkata");	
		cities.add("Hyderabad");	
		cities.add("Lucknow");	
		cities.add("Mysore");
		
		System.out.println(cities);

//Difference between  add and offer		
		
		
		
		
	// adding element number 9 to a queue which has maximum capacity of 8	
	// This gives error as exception -->illegalStateException
//		cities.add("Pune");
//		System.out.println(cities);
		
		
		
		// offer element number 9 to a queue which has maximum capacity of 8
		//This does not throw any exception also it does not add cities name
		//so it is safer than add method
	cities.offer("pune");
	System.out.println(cities);
	
	
	
		
	}

}
