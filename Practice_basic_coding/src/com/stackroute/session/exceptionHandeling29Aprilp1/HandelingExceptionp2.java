package com.stackroute.session.exceptionHandeling29Aprilp1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandelingExceptionp2 {

	public static void main(String[] args) {
		
		//2.Single Try with multiple catch block handeling multiple exception
		try {
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int res =num1/num2;
			System.out.println(res);
		}
		
		catch(InputMismatchException ie) {
			System.out.println("Number should not be string type");
		}
		catch(ArithmeticException ae) {
			System.out.println("Num 2 should not be zero");
		}

	}

}
