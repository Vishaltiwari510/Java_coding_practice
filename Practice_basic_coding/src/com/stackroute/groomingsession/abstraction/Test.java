package com.stackroute.groomingsession.abstraction;


abstract class Car{  
	  
	   abstract void run();  
	   void speed(){
		   System.out.println("increase  speed");
		   }  
	 }  


	 
	 class Honda extends Car{  
	 void run()
	 {System.out.println("Honda running safely..");
	 }  
	 }  
	 
	 abstract class Tata extends Car{
		 void gear() {
			 System.out.println("change gear");
		 }
	 }
	 
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Honda(); 
	
		car.run();  
		car.speed(); 
		
	}

}
