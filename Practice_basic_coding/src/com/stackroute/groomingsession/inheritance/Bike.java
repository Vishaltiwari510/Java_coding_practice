package com.stackroute.groomingsession.inheritance;

public class Bike {
	
  public int cc;
 
  public int manufacturingYear;
	public double onRoadPrice;
  
	public Bike() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Bike(int cc, int manufacturingYear, double onRoadPrice) {
		super();
		this.cc = cc;
		this.manufacturingYear = manufacturingYear;
		this.onRoadPrice = onRoadPrice;
	}




	public void displayDetails() {
		System.out.println("This is Parent class");
	}




	@Override
	public String toString() {
		return "Bike [cc=" + cc + ", manufacturingYear=" + manufacturingYear + ", onRoadPrice=" + onRoadPrice + "]";
	}
	
	
	
	
}
