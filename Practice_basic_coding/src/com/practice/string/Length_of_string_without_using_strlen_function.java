package com.practice.string;

import java.util.Scanner;

public class Length_of_string_without_using_strlen_function {

	public static void main(String[] args) {
		System.out.println("Enter the character");
   String s1;
   Scanner sc = new Scanner(System.in);
   s1 = sc.nextLine();
   String n=s1+'\0';
   int length=0;
 for(int i=0; i<n.length(); i++) {
	 if(n.charAt(i)!='\0') {
		 length++;
	 }
 }
 System.out.println(length);
	}

}
