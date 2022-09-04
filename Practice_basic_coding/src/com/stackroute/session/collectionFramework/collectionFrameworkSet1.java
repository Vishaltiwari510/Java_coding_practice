package com.stackroute.session.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class collectionFrameworkSet1 {

	public static void main(String[] args) {
	
		HashSet<Integer> myset = new HashSet<>();
    
    myset.add(50);
    myset.add(90);
    myset.add(60);
    myset.add(10);
    myset.add(20);
    myset.add(500);
    myset.add(200);
//    myset.add(20);   // duplicates not allowed in set
    
    System.out.println(myset);  //set gives unordered data
    
// Method-1 --> To sort a hashset (convert hashset to list to use sort method for sorting)
   System.out.println("After sorting ----------------------");
    List<Integer> myList = new ArrayList<>(myset); 
    Collections.sort(myList);
    System.out.println(myList);
    
    
    
   
    
	}

}
