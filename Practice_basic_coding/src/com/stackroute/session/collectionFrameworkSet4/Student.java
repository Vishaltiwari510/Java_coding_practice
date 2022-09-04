package com.stackroute.session.collectionFrameworkSet4;

public class Student {
	private int rollNo;
	private String name;
	private int marks;
	
	
	
	
	public int getRollNo() {
		return rollNo;
	}




	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getMarks() {
		return marks;
	}




	public void setMarks(int marks) {
		this.marks = marks;
	}




	

	@Override
	public String toString() {
		return "collectionArraylist7 [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

	
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}


public Student() {
	// TODO Auto-generated constructor stub
}




}
