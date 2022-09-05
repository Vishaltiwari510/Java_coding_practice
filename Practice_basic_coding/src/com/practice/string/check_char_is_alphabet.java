package com.practice.string;

import java.util.Scanner;

public class check_char_is_alphabet {

	public static void main(String[] args) {
		
		System.out.println("Enter the character");
		char c1;
		Scanner sc = new Scanner(System.in);
		c1 = sc.next().charAt(0);
		
			if((c1>=65 && c1<=90) || (c1>=97 && c1<=122) ) 
				System.out.println("True");
		
			else {
				System.out.println("False");
			}
		
		
		

	}

}
