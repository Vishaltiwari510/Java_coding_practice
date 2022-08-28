package com.stackroute.session.oopsEncapsulation25AprilP1;

public class C extends A {
//Sub class of same package
	public static void main(String[] args) {
		C c  = new C();
		
//With Public accessibility class A object is accessible here
//With default accessibility Class A object is accessible here		
		
				
//with public accessibility class A member is accessible here
//with default accessibility class A member is accessible here
//Private modifiers of class A  is not  accessible here
// Protected modifiers class A can also be accessed here
		
		System.out.println(c.name);
	}
}
