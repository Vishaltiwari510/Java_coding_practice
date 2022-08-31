package com.stackroute.session.throwAndThrowsExceptionMay2;

public class Main {

	public static void main(String[] args) {
		 try  
	        {  TestThrowAndThrows obj = new TestThrowAndThrows();
	            obj.method();  
	        }  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println("caught in main() method");  
	        }  

	}

}
