package com.stackroute.session.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class collectionArraylist5 {

	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList<>();	
	    
		Integer i=10;
	    test.add(i);
	    
	   
	    test.add(10);
	    test.add(11);
	    test.add(15);
	    test.add(12);
	    test.add(11);
	    test.add(7);
	    test.add(2);
	    System.out.println(test);

	   
	    System.out.println("After sorting --------------------------");
	
	    Collections.sort(test);
	    
	    System.out.println(test);
	    
	    
	    Collections.sort(test, Collections.reverseOrder());
	    System.out.println("After reverse sorting --------------------------");
	    System.out.println(test);
	    
	
	}

}
