package com.practice.string;

import java.util.Scanner;

public class Toggle_each_char_of_string {

	public static void main(String[] args) {
		String S1;
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		S1 = sc.nextLine();
		int n[] = new int[S1.length()];
		for(int i=0; i<S1.length(); i++) {
			if(S1.charAt(i)>='A' && S1.charAt(i)<='Z') {
				  n[i]= (S1.charAt(i)+32);
				
			}
			else if(S1.charAt(i)>='a' && S1.charAt(i)<='z') {
				  n[i]= (S1.charAt(i)-32);
			}
			
			
		}
		String str =null;
        for(int i: n){
            str = Character.toString((char)i);
            System.out.println(str);
        }
		
		
		
	}

}
