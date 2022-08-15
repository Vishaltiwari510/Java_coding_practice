package com.practice.basic;

import java.util.Scanner;

public class First_N_Natural_nimber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		  Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the Value of N");
	       int num = sc.nextInt();
	      for(int i=0; i<num; i++) {
	    	  sum = sum+i;
	      }
	      System.out.println("Sum of First "+num+" Natural Number is "+sum);
	
	      sc.close();
	      }
}
