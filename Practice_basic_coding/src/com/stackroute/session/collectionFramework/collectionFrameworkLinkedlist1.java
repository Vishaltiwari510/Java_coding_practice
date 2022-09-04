package com.stackroute.session.collectionFramework;

import java.util.LinkedList;

public class collectionFrameworkLinkedlist1 {

	//1. Linkedlist gives ordered collection.
	//2.Implementation of both list and queue.
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<String>();

		
		cities.add("Banglore");	
		cities.add("mumbai");	
		cities.add("chennai");	
		cities.add("delhi");	
		cities.add("kolkata");	
		cities.add("Hyderabad");	
		cities.add("Lucknow");	
	
	System.out.println(cities);
	System.out.println("After removing ----------------");

	
	
	//------------------------------------------------------------
//This remove first element of linkedlist since 
//linkedlist is an implementation of queue, so in 
//queue whatever comes in first , goes out first
	cities.remove();
	System.out.println(cities);

	
	
//cities.poll() methods pick first element of linkedlist and as we print cities 
	//it delete the picked element.
	System.out.println("------------------------");	
	System.out.println("poll :"+cities.poll());
	System.out.println("After poll "+cities);

	
	
	
//--------------------------------------------------------
//cities.peek() methods pick first element of linkedlist but it does not 
//remove first element unlike poll method.
	System.out.println("----------------------------");
	System.out.println("Peek :"+cities.peek());
	System.out.println("After Peek "+cities);
	
	
	
//------------------------------------------------------------	
//cities.pollast() method retrieves the last element of linkedlist and as we print cities 
	//it delete the last element.
	System.out.println("---------------------------------");
	System.out.println("Poll last :"+cities.pollLast());
	System.out.println("After pollast :"+cities);
	
	
	//------------------------------------------------------------		
	//cities.peeklast() method retrieves the last element of linkedlist but it does not 
	//remove first element unlike polllast method.
		System.out.println("---------------------------------");
		System.out.println("peek last :"+cities.peekLast());
		System.out.println("After pollast :"+cities);	

		
		
	
//------------------------------------------------------------	
//cities.offer() method works similar to add method as it add one 
//element at the last
System.out.println("-------------------------------------");
cities.offer("pune");
System.out.println("After applying offer method :"+cities);



//------------------------------------------------------------	
//cities.addFirst() method add element at first position.
System.out.println("-----------------------------------");
cities.addFirst("kochi");
System.out.println("After applying addFirst method :"+cities);

		


//------------------------------------------------------------	
//cities.offerFirst() method add element at first position.
System.out.println("-----------------------------------");
cities.offerFirst("Ahmedabad");
System.out.println("After applying addFirst method :"+cities);



	
	
	
	
	
	
	
	
	}
}