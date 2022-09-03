package com.stackroute.session.collectionFrameworkComparable;

import java.util.ArrayList;
import java.util.Collections;

public class collectionArrayList7class2 {

	
	public static void main(String[] args) {
		
		collectionArraylist7 student1 = new collectionArraylist7(4, "virat", 99);
		collectionArraylist7 student2 = new collectionArraylist7(5, "rohit", 90);
		collectionArraylist7 student3 = new collectionArraylist7(7, "dhoni", 78);
		collectionArraylist7 student4 = new collectionArraylist7(2, "shami", 88);
		//now we want to create a list of student
		ArrayList<collectionArraylist7> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		
		System.out.println(students);
		
		Collections.sort(students);
		
		System.out.println("traversing using enhanced for loop-------------------");
		// traversing using enhanced for loop
		for(collectionArraylist7 stud:students) {
			System.out.println(stud);
		}
		
		
		
	}
	
	
}
