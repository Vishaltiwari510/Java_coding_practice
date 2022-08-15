package com.practice.basic;

import java.util.Scanner;

public class Sum_of_number_in_Given_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int sum=0;
       Scanner sc  = new Scanner(System.in);
       System.out.println("Enter first Number");
       int num1 = sc.nextInt();
       System.out.println("Enter Second Number");
       int num2 = sc.nextInt();
       for(int i=num1; i<=num2; i++) {
    	    sum=sum+i;
       }
       System.out.println("Sum of number in given range is " + sum);
       
	}

}
