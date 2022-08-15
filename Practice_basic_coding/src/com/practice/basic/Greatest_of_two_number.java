package com.practice.basic;

import java.util.Scanner;

public class Greatest_of_two_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number");
      int num1 = sc.nextInt();
      System.out.println("Enter Second Number");
      int num2 = sc.nextInt();
      if(num1>num2) {
    	  System.out.println(num1+" is grater than "+ num2);
      }
      else {
    	  System.out.println(num2+" is grater than "+ num1);
      }
	}

}
