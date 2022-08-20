package com.stackroute.session.oops20April;

public class CarImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW bmw = new BMW();
		System.out.println(bmw.airbags);

		
		BMW bmw1 = new BMW("bmw x1", 2021, 456435.56, "Red", (byte)5, (short)500, "SUV", (byte)6, "petrol", 234234.56);
		Audi audi = new Audi("audi a4", 2022, 565535.56, "Black", (byte)6, (short)600, "TUV", (byte)7, "Diesel",true);
	System.out.println(bmw1.airbags);
	bmw1.displayCar();
	bmw1.displayBMW();
	audi.displayAudi();
	}

}
