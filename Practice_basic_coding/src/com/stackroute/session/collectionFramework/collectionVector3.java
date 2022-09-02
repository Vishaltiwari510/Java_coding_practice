package com.stackroute.session.collectionFramework;

import java.util.Vector;

public class collectionVector3 {

	public static void main(String[] args) {
		
		//creating vector as object to add homogeneous element using generic
		//since every class is child of Object, so creating vector as object 
		//allow to store homogeneous data.
		Vector<Object> test = new Vector<>();
		test.add(5);
		test.add(6.5f);
		test.add(700);
		test.add(8);
		test.add("hello");  //error not applicable string argument
	     System.out.println(test);

	}

}
