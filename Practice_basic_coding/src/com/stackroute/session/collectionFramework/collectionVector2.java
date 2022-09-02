package com.stackroute.session.collectionFramework;

import java.util.Vector;

public class collectionVector2 {

	public static void main(String[] args) {
		// Accepting homogeneous data in vector using generic
		
     Vector<Integer> rollnos = new Vector<>();
     rollnos.add(5);
     rollnos.add(6);
     rollnos.add(7);
     rollnos.add(8);
 //    rollnos.add("hello");  //error not applicable string argument
     System.out.println(rollnos);
     
	}

}
