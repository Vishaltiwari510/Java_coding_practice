package com.stackroute.practice.assignment21April;

public class CNG extends Engine {
	int displacement;
	   int cylinder;
	   String compRatio;
	   
	   public CNG() {
		// TODO Auto-generated constructor stub
	}

	public CNG(String modelNo, int maxPower, int maxRPM, int maxTorque, int weight, int displacement, int cylinder,
			String compRatio) {
		super(modelNo, maxPower, maxRPM, maxTorque, weight);
		this.displacement = displacement;
		this.cylinder = cylinder;
		this.compRatio = compRatio;
	}
	   
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Displacement : " + displacement);
		 System.out.println("Nymber of Cylinders : " + cylinder);
		 System.out.println("Comp Ratio : " + compRatio);
		 
	}
}
