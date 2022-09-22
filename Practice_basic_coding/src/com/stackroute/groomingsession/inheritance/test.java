package com.stackroute.groomingsession.inheritance;

public class test {

	public static void main(String[] args) {
		Bike bike = new Bike(250, 2022, 45345.54);
		Honda honda = new Honda(250, 2022, 45345.54, 101, "Black");
         System.out.println(honda);
         System.out.println(bike);
	}

}
