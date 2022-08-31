package com.stackroute.session.throwAndThrowsExceptionMay2;

public class TestThrowAndThrows {
	  // defining a user-defined method  
    // which throws ArithmeticException  
    static void method() throws ArithmeticException  
    {  
        System.out.println("Inside the method()");  
        //as soon as jvm get this it report inside main that exception has been find now you handle it using try catch
        throw new ArithmeticException("throwing ArithmeticException");  
    }  
}
