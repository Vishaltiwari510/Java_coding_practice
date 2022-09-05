package com.practice.string;

import java.util.Scanner;

public class Count_no_of_vowels_String {
	  
	public static void main(String[] args) {
	String s1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	s1=sc.nextLine();
	int length=0;
	for(int i=0; i<s1.length(); i++) {
		if(s1.charAt(i)=='A' || s1.charAt(i)=='E' ||
				s1.charAt(i)=='I' || s1.charAt(i)=='O' 
				|| s1.charAt(i)=='U' || s1.charAt(i)=='a'
				|| s1.charAt(i)=='e' || s1.charAt(i)=='i'
				|| s1.charAt(i)=='o' || s1.charAt(i)=='u') {
		length++;
			
		}

		
	}
	System.out.println(length);
	}

}
