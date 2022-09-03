package com.stackroute.session.collectionFrameworkComparator;

import java.util.ArrayList;

import java.util.Collections;



public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(4, "virat", 99);
		Student student2 = new Student(5, "rohit", 90);
		Student student3 = new Student(7, "dhoni", 78);
		Student student4 = new Student(2, "shami", 88);
		//now we want to create a list of student
		ArrayList<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		
		System.out.println(students);
		
		Collections.sort(students, new rollNoSort());
		
		System.out.println("traversing using enhanced for loop-------------------");
		// traversing using enhanced for loop
		for(Student stud:students) {
			System.out.println(stud);
		}
		
		System.out.println("sorting based on name---------------");
		Collections.sort(students, new NameSort());
		for(Student stud:students) {
			System.out.println(stud);
		}
	}

}
