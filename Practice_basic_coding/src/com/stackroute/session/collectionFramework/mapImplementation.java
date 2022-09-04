package com.stackroute.session.collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapImplementation {

	public static void main(String[] args) {
		
		Map<Integer, String> myMap = new HashMap<>();
		
         myMap.put(18, "virat");
         myMap.put(7, "dhoni");
         myMap.put(45, "rohit");
         myMap.put(12, "rahul");
         
  // get method return value corresponding to key provided as argument  
         System.out.println("Getting value corresponding to key using get method---------------------");
         System.out.println(myMap.get(7));
 
         
//method -1> keyset() method returns the set of keys 
     System.out.println("Getting only keys using keyset --------------------");
     Set<Integer> keys  = myMap.keySet();
     System.out.println(keys);
     
         
         
//method -1-->getting all the values correponding to key by iterating over each key
     System.out.println("Getting  key value pair using keyset by iterating over keys ------------------------------");
 for(int key:keys)  {
	 System.out.println(key+" : "+myMap.get(key));
 }
     
 
//method->2 --> getting all key value pairs using entry set
 System.out.println("Getting  keys-values pair using entryset without iteration --------------------");
 System.out.println(myMap.entrySet());
 
 
 
 //we can store key value pair in type set
 System.out.println("Storing entry set returned key value pair "
 		+ "in a set of entry of key value pair and then printing that set");
 Set<Entry<Integer, String>> myset =  myMap.entrySet();
 System.out.println(myset);
 
 
 
 //Another way to print key-value pair using entryset
 System.out.println("Another way to print key value pair by iterating entries over entryset---------------------------");
 for(Entry<Integer, String> entry: myMap.entrySet()) {
	 System.out.println(entry);
 }
	}

}
