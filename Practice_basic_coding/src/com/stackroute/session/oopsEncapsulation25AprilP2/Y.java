package com.stackroute.session.oopsEncapsulation25AprilP2;

import com.stackroute.session.oopsEncapsulation25AprilP1.A;

//With Public accessibility class A object is accessible here
//With default accessibility Class A object is not accessible here



//with public accessibility class A member is accessible here
//with default accessibility class A member cannot be accessible here
//Private modifiers of class A  is not  accessible here
//Protected modifiers class A can also be accessed here
public class Y extends A {
//subclass of other packages
	public static void main(String[] args) {
		Y y  = new Y();
		System.out.println(y.name);
	}
}
