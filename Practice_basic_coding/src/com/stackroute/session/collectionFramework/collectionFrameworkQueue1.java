package com.stackroute.session.collectionFramework;


import java.util.Arrays;
import java.util.PriorityQueue;

public class collectionFrameworkQueue1 {

	public static void main(String[] args) {
	//Priority queue gives unique and unordered data on primary properties
	
		PriorityQueue<Integer> test = new PriorityQueue<Integer>();
		
		    test.add(10);
		    test.add(11);
		    test.add(15);
		    test.add(12);
		    test.add(11);
		    test.add(7);
		    test.add(2);
		    
		    
		    System.out.println(test);
//		  
//		    Iterator itr=test.iterator();  
//		    while(itr.hasNext()){  
//		    System.out.println(itr.next());  
//		    } 
		    
//sorting a priority by  removing the elements from the PriorityQueue 
//one by one and add them to some array.
		    Object[] arr = new Object[test.size()];
		    for (int i = 0; i < arr.length; i++) {
		        arr[i] = test.remove();
		    }

		    System.out.println(Arrays.toString(arr));

	}

}
