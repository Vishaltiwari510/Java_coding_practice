package com.stackroute.session.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;


//traversing over collection using enumeration
public class collectionArraylist3 {

	public static void main(String[] args) {
	
ArrayList<Integer> test = new ArrayList<>();	
	    
		Integer i=10;
	    test.add(i);
	    
	    int x=11;
	    test.add(x);	    
	    test.add(15);
	    test.add(12);
	    test.add(11);
	    test.add(2, 900);
	    System.out.println(test);

	   
	    System.out.println("--------------------------");
	
	Enumeration<Integer> testItr = Collections.enumeration(test);   
	    
   while(testItr.hasMoreElements()) { //hasMoreElement in enumeration occurs similar to hasnext in iterator
	   int next = testItr.nextElement(); //nextElement in enumeration occurs similar to next in iterator
	   System.out.println(next);
	   System.out.println("plus 10 "+(next+10));
   
	   
	//but here we dont have remove method   
//	  testItr.remove(11);  gives error
   if(next%2==0) {
	   System.out.println("even");
   }
   else {
	   System.out.println("odd");
   }
   
   
   }
	}

}
