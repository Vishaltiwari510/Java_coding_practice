package com.stackroute.session.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class collectionArrayList6 {

	public static void main(String[] args) {
ArrayList<String> test = new ArrayList<>();	
	    
		
	    
	   
	    test.add("virat");
	    test.add("rohit");
	    test.add("rahul");
	    test.add("ashwin");
	    test.add("bumrah");
	    test.add("shami");
	    test.add("dhoni");
	    System.out.println(test);

	   
	    System.out.println("After sorting --------------------------");
	
	    Collections.sort(test);
	    
	    System.out.println(test);
	    
	    
	    Collections.sort(test, Collections.reverseOrder());
	    System.out.println("After reverse sorting --------------------------");
	    System.out.println(test);
	    

	}

}
