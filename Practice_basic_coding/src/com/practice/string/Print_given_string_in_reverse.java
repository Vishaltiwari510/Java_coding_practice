package com.practice.string;

import java.util.Scanner;

public class Print_given_string_in_reverse {

	public static void main(String[] args) {
	String s1;
	System.out.println("Enter the string");
	Scanner sc = new Scanner(System.in);
	s1 = sc.nextLine();
	
	String rev = "";
	for(int j=s1.length()-1; j>=0; j--) {
		rev = rev+s1.charAt(j);
	}
	
	System.out.println(rev);
	}

}
