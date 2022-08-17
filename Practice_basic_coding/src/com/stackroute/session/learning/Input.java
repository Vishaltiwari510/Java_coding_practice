package com.stackroute.session.learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//session-2 - 14 April
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // a->unicode ->binary -> input to program
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("Enter name");
			String name  = br.readLine();
		// Read Entire line
			System.out.println(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		//2nd Example shows problem with buffer is that it always gives data in stream 
		// so we need to convert it into required data type
		System.out.println("Enter salary");
		// Using Wrapper classes
		try {
			double salary = Double.parseDouble(br.readLine());
			System.out.println(salary);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello");
	}

}
