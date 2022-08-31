package com.stackroute.session.wrapperclass29April;

public class wrapper {

	public static void main(String[] args) {
		
		int num = 35874;
//		Integer numwrapper = new Integer(num); //deprecated due to introduction of autoboxing concept

		
		//AutoBoxing
		Integer numwrapper =num;
		System.out.println(numwrapper);
		
		//converting to a double value
		System.out.println(numwrapper.doubleValue());
	
	//converting String to integer 
		String input ="121323";
		int salary = Integer.parseInt(input);
       System.out.println(salary);
	
	}

}
