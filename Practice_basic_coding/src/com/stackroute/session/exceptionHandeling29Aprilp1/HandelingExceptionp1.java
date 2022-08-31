package com.stackroute.session.exceptionHandeling29Aprilp1;

import java.util.Scanner;

public class HandelingExceptionp1 {
	//1.simple aritnmatic exception handeling using try catch 
public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res =num1/num2;
		System.out.println(res);
	}
	catch(ArithmeticException ae) {
		System.out.println("Num 2 should not be zero");
	}
}
}
