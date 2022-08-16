package com.practice.basic;

import java.util.Scanner;

public class Greatest_of_Three_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first Number");
       int num1 = sc.nextInt();
       System.out.println("Enter second Number");
       int num2 = sc.nextInt();
       System.out.println("Enter Third Number");
       int num3 = sc.nextInt();
       if(num1>num2 && num1> num3) {
    	   System.out.println(num1+ " is greatest");
    	   
       }
       else if(num2>num3) {
    	   System.out.println(num2 +" is greatest");
       }
       else {
    	   System.out.println(num3 +" is greatest");
       }
       sc.close();
	}

}
