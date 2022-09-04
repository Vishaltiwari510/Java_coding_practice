package com.stackroute.session.collectionFrameworkSet5;


import java.util.LinkedHashSet;
import java.util.TreeSet;


//LinkedHashset is ordered and again using all three method discussed it can be sorted
public class collectionFrameworkSet5 {

public LinkedHashSet<Student> getStudents(){
		
	LinkedHashSet<Student> myset = new LinkedHashSet<>();
		
		myset.add(new Student(18, "virat", 99));
	    myset.add(new Student(7, "dhoni", 68));
	    myset.add(new Student(45, "rohit", 78));
	    myset.add(new Student(24, "rahul", 87));
	    myset.add(new Student(16, "surya", 76));
	    myset.add(new Student(55, "rishabh", 45));
	    myset.add(new Student(34, "hardik", 59));

	    
	    return myset;
	}

	public static void main(String[] args) {
		collectionFrameworkSet5 stu = new collectionFrameworkSet5();		
		LinkedHashSet<Student> hset = stu.getStudents();
     System.out.println("Only ordered collection using linkedhashset (not sorted)");
		System.out.println(hset);
		
	
		
	}

}
