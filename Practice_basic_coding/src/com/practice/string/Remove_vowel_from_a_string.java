package com.practice.string;

import java.util.Scanner;

public class Remove_vowel_from_a_string {

	public static void main(String[] args) {
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		s1=sc.nextLine();
		String res="";
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)=='A' || s1.charAt(i)=='E' ||
					s1.charAt(i)=='I' || s1.charAt(i)=='O' 
					|| s1.charAt(i)=='U' || s1.charAt(i)=='a'
					|| s1.charAt(i)=='e' || s1.charAt(i)=='i'
					|| s1.charAt(i)=='o' || s1.charAt(i)=='u') {
			
				res = res+"";
				
				
			}
			else {
				res=res+s1.charAt(i);
			}

	}
System.out.println(res);
}
}