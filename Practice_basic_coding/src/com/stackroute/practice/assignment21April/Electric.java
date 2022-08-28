package com.stackroute.practice.assignment21April;

public class Electric extends Engine {
    
    String currentType;
    int voltage;
    
    public Electric() {
		// TODO Auto-generated constructor stub
	}

	public Electric(String modelNo, int maxPower, int maxRPM, int maxTorque, int weight, String currentType,
			int voltage) {
		super(modelNo, maxPower, maxRPM, maxTorque, weight);
		this.currentType = currentType;
		this.voltage = voltage;
	}
    
	public void displayinfo() {
		super.displayinfo();
		 System.out.println("Current Type : " + currentType);
		 System.out.println("Voltage : " + voltage);
		 
		 
	}
     
     
}
