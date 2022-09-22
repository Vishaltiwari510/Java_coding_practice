package com.practice.string;

import java.util.Scanner;

//count the number of uppercase letter in a given string


public class practice1 {

	public static void main(String[] args) {
		String str;
		int c=0;
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	str = sc.nextLine();
for(int i=0; i<str.length(); i++) {
	char ch = str.charAt(i);
	if(Character.isUpperCase(ch)) {
		c++;
	}
}
System.out.println(c);
	}

}
