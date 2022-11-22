package com.practice.string;

import java.util.Scanner;

public class sortedstring {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String [] arr = new String[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextLine();
			
		}
		sortedstring.printer(arr);
	}
		public static void printer(String [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		}		

	
	
	
	
	

}
