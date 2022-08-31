package com.stackroute.session.exceptionHandeling29Aprilp1;

import java.util.InputMismatchException;
import java.util.Scanner;
//3. Nested try catch statement for handeling multiple exception
public class HandelingExceptionp3 {

	public static void main(String[] args) {
		
		//parent try catch block
		try {
			Scanner sc = new Scanner(System.in);
			int num1 =0;
			int num2 = 0;
			
			
			//first child try catch block
			try {
				System.out.println("Enter number1 .....");
				num1  = sc.nextInt();
			}catch(InputMismatchException ie) {
				System.out.println("Wrong Input....");
			}
			
			
			
			//second child try catch block
			try {
				System.out.println("Enter number2 .....");
				num2  = sc.nextInt();
			}catch(InputMismatchException ie) {
				System.out.println("Wrong Input......");
			}
			
			
			
			int res = num1/num2;
			System.out.println("Division of number 1 by number 2 "+res);
			
		} //parent try block closed
		//parent catch block 
		catch(ArithmeticException ae) {
			System.out.println("Num 2 should not be zero");
		}

	}

}
