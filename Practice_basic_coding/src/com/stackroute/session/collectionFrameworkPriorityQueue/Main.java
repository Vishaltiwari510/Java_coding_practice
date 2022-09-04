package com.stackroute.session.collectionFrameworkPriorityQueue;

import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		
		PriorityQueue<Student> students = new PriorityQueue<>(new rollNoSort());
		
		students.add(new Student(1,"vishal", 90));
		students.add(new Student(5,"abc", 70));
		students.add(new Student(2,"xyz", 100));
		
		
		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());
	}

}
