package com.stackroute.practice.assignment21April;

public class Engine {

	 String modelNo;
     int maxPower;
     int maxRPM;
     int maxTorque;
     int weight;
     
     public Engine() {
		// TODO Auto-generated constructor stub
	}

	public Engine(String modelNo, int maxPower, int maxRPM, int maxTorque, int weight) {
		
		this.modelNo = modelNo;
		this.maxPower = maxPower;
		this.maxRPM = maxRPM;
		this.maxTorque = maxTorque;
		this.weight = weight;
	}
     
     public void displayinfo() {
    	 System.out.println("Model Number : " + modelNo);
    	 System.out.println("Max Power : " + maxPower);
    	 System.out.println("Max RPM : " + maxRPM);
    	 System.out.println("Max Torque : " + maxTorque);
    	 System.out.println("Weight : " + weight);
     }
}
