package com.practice.string;

import java.util.Scanner;

public class remove_space_from_a_string {

	public static void main(String[] args) {
		String s1;
		System.out.println("Enter the string ........");
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		String s2;
		s2 = s1.replace(" ", "");
		System.out.println(s2);

	}

}
