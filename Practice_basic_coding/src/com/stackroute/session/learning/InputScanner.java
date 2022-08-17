package com.stackroute.session.learning;
//session-2 - 14 April
import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // 1.Scanner class helps us to take input in required format without being 
		// bother of conversion as it was happening in BufferReader.
	//  2. This also reduce task of creating try catch block unlike Buffered Reader
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name");
	String name = sc.next();
	System.out.println(name);
	System.out.println("Enter salary");
	double salary = sc.nextDouble();
	System.out.println(salary);
	sc.close();
	}

}
