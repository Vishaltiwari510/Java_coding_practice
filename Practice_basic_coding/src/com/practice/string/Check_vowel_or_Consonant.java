package com.practice.string;

import java.util.Scanner;
// Taking input of character check whether character is vowel or consonant
public class Check_vowel_or_Consonant {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		
		// Taking input of character , nextChar does not work
		System.out.println("Enter the character");
		ch = sc.next().charAt(0);
		
		if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
			System.out.println("Vovel");
		}
		else {
			System.out.println("Consonant");
		}
sc.close();
	}

}
