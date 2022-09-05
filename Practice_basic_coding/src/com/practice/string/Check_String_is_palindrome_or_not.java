package com.practice.string;

import java.util.Scanner;

public class Check_String_is_palindrome_or_not {

	public static void main(String[] args) {
		String s1;
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		String rev="";
		for(int i=s1.length()-1; i>=0; i--) {
			rev = rev+s1.charAt(i);
		}
if(s1.equals(rev)) {
	System.out.println("palindrome");
}
else {
	System.out.println("not palindrome");
}
	}

}
