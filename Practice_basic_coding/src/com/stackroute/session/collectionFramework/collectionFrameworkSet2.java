package com.stackroute.session.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class collectionFrameworkSet2 {

	public static void main(String[] args) {
		
//method-2 ---> for sorting ----> converting hashset to treeset		
//		Set<Integer> myset = new TreeSet<>();  //Ascending order
		Set<Integer> myset = new TreeSet<>(Collections.reverseOrder()); //Descending or reverse order
	    myset.add(50);
	    myset.add(90);
	    myset.add(60);
	    myset.add(10);
	    myset.add(20);
	    myset.add(500);
	    myset.add(200);

	    
	    System.out.println(myset);  //set gives unordered data
	    
	
	   
	    
	    

	}

}
