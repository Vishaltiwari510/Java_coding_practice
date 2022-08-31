package com.stackroute.session.throwsExceptionMay2;

public class Main {

	public static void main(String[] args) {
		 TestThrows obj = new TestThrows();  
	        try {  
	            System.out.println(obj.divideNum(45, 0));  
	        }  
	        catch (ArithmeticException e){  
	            System.out.println("\nNumber cannot be divided by 0");  
	        }  
	          
	        System.out.println("Rest of the code..");  

	}

}
