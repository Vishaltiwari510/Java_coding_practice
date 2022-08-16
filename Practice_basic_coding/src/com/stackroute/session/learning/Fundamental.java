package com.stackroute.session.learning;

public class Fundamental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First way
		int totalMarks;
		byte subject1Marks;
		byte subject2Marks;
		 subject1Marks = 98;
	     subject2Marks = 98;
		totalMarks = (subject1Marks + subject2Marks);
		System.out.println(totalMarks);
		
		//2nd way
		Short totMarks;
		byte sub1Marks;
		byte sub2Marks;
		 sub1Marks = 97;
	    sub2Marks = 98;
		totMarks =  (short) (sub1Marks + sub2Marks);
		System.out.println(totMarks);
		
		// integer devides by integer gives integer and since 
		//averageMarks is float so it convert resultant to float, it gives 97.0
		float averageMarks;
		averageMarks = totMarks/2;
		System.out.println(averageMarks);
		
		
		// This can be corrected by below method, so it gives 97.5
		float avgMarks;
		avgMarks = (float) totMarks/2;
		System.out.println(avgMarks);
	}
	

}
