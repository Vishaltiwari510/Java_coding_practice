package com.practice.arrays;

import java.util.Scanner;

public class Sum_of_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr;
     int n;
     int sum=0;
     System.out.println("Enter the size of array");
     Scanner scan = new Scanner(System.in);
     n = scan.nextInt();
     arr = new int [n];
     System.out.println("Enter Element in arrays for sum");
     Scanner sc = new Scanner(System.in);
     for(int i=0; i<n; i++) {
    	 arr[i] = sc.nextInt(); 
     }
     for(int i=0; i<n; i++) {
    	sum = sum+arr[i];
     }
     System.out.println("Sum of Element in array is : " +sum);
     sc.close();
	}

}
