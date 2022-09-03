package com.stackroute.session.collectionFrameworkComparable;

public class collectionArraylist7 implements Comparable<collectionArraylist7>{

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

	
	public collectionArraylist7(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}


public collectionArraylist7() {
	// TODO Auto-generated constructor stub
}




@Override
public int compareTo(collectionArraylist7 o) {
	
//	return this.marks-o.marks; //return ascending order of marks
//	return o.marks - this.marks;  //return descending order of marks
//	return this.rollNo-o.rollNo;
//	return o.rollNo-this.rollNo;
	
	return this.name.compareTo(o.name); //ascending order of string type name uses compareTo method internally

} 


	

}
