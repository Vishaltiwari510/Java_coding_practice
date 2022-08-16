package com.practice.basic;

import java.util.Scanner;

public class CheckingEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the Number");
	       int num = sc.nextInt();
	       if(num%2==0) {
	    	   System.out.println("Even Number");
	       }
	       else  {
	    	   System.out.println("Odd Number");
	       }
	      sc.close();
	}

}
