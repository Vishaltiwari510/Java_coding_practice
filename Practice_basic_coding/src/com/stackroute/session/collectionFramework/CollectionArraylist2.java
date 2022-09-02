package com.stackroute.session.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;


//traversing over collection(here arraylist) using iterator
public class CollectionArraylist2 {

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
	
	Iterator<Integer> testItr = test.iterator();    
	    
   while(testItr.hasNext()) {
	   int next = testItr.next();
	   System.out.println(next);
	   System.out.println("plus 10 "+(next+10));
   
   if(next%2==0) {
	   System.out.println("even");
   }
   else {
	   System.out.println("odd");
   }
   
   
   }
	}

}
