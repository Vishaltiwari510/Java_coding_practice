package com.practice.string;

import java.util.Scanner;

public class Practice2 {
//Count the number of special character in the string
	public static void main(String[] args) {
	String str;
	int c=0;
	System.out.println("Enter the string");
   Scanner sc = new Scanner(System.in);
    str = sc.nextLine();
    for(int i=0; i<str.length(); i++) {
    	int num = str.charAt(i);
    	if((num>=32 && num<=64 ) || (num>=91 && num<=96 ) || (num>=123 && num<=126 )) {
    		c++;
    	}
    }
    System.out.println(c);
	}

}
