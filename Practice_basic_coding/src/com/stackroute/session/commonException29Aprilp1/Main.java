package com.stackroute.session.commonException29Aprilp1;

public class Main {

	public static void main(String[] args) {
		
		int res=100/0;
		System.out.println(res);   //Arithmatic Exception
		
		int nos[] = new int[-5];  //Negative Array size Exception
		
		nos[5000] = 100;    // Array Index out of Bound Exception
		
		//Another common Exception is Null pointer exception
		//when value is not set using setter method and we call 
		// getter methods this also leads to Null Pointer Exception
		
		
		

	}

}
