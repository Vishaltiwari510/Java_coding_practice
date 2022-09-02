package com.stackroute.session.collectionFramework;

import java.util.ArrayList;


public class collectionArraylist1 {

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
	//test.remove(900);   //considering 900 as position
	//gives error index out of bound exception
	
	//    int val=900; // This also dont recognised as value as it is primitive
	    //type and not object type
	
	//now 900 is considered as value thats why it delete 900
	Integer val=900;
	test.remove(val);
	
	System.out.println(test);
	}

}
