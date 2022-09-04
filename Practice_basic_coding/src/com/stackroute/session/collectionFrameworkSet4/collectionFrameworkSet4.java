package com.stackroute.session.collectionFrameworkSet4;

import java.util.HashSet;
import java.util.TreeSet;



public class collectionFrameworkSet4 {

public HashSet<Student> getStudents(){
		
		HashSet<Student> myset = new HashSet<>();
		
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
		collectionFrameworkSet4 stu = new collectionFrameworkSet4();		
		HashSet<Student> hset = stu.getStudents();
     
		
		
		
 //while writting treeset we must ensure if it is of type user defined object
		//it must be created with comparator or user defined class must have comparator
		
		System.out.println("After sorting using treeset and comparable of namesort()");
     TreeSet<Student> tset = new TreeSet<>(new NameSort());
		tset.addAll(hset);		
		
		for(Student stud:tset)
		{
			System.out.println(stud);
		}
		
	}

}
