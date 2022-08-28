package com.stackroute.session.oopsEncapsulation25AprilP1;

public class B {
// Other class of same package
	public static void main(String[] args) {
	
//With Public accessibility class A object is accessible here
//With default accessibility Class A object is accessible here
		
				
//with public accessibility class A member is accessible here
//with default accessibility class A member is accessible here
//Private modifiers of class A  is not  accessible here
// Protected modifiers class A can also be accessed here
		
		A a  = new A();
		System.out.println(a.name);
	}
}
