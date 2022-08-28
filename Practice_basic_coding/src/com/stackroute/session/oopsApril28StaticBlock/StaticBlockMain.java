package com.stackroute.session.oopsApril28StaticBlock;

public class StaticBlockMain {
 static int number;
	static {
		number=100;
		number++;
		System.out.println("Number value in static block "+number);
	}
	
	
	public static void main(String[] args) {
		number++;
		System.out.println("Number value in main methods "+number);
		

	}
	
	static {
		number++;
		System.out.println("Number value in second static block "+number);
	}

}
