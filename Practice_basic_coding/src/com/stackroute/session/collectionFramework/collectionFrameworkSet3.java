package com.stackroute.session.collectionFramework;

import java.util.HashSet;

import java.util.TreeSet;

public class collectionFrameworkSet3 {
	
	
	public HashSet<Integer> getElements(){
		
		HashSet<Integer> myset = new HashSet<>();
		
		myset.add(50);
	    myset.add(90);
	    myset.add(60);
	    myset.add(10);
	    myset.add(20);
	    myset.add(500);
	    myset.add(200);

	    
	    return myset;
	}

	public static void main(String[] args) {
		collectionFrameworkSet3 stu = new collectionFrameworkSet3();		
		HashSet<Integer> hset = stu.getElements();

     System.out.println(hset);
     
     
 //Method-3 -->Here method returntype (hashset) is not changing despite that by putting hashset
     //element to treeset using addall() method of treeset and gets sorted data
		TreeSet<Integer> tset = new TreeSet<>();
		tset.addAll(hset);
		
		System.out.println(tset);
		
		
	}

}
