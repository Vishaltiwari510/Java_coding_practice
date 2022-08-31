package com.stackroute.session.FileIOusingBufferMay4p2;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class ReadUsingBuffer {

	public static void main(String[] args) throws IOException {
//		int ch;
//		BufferedReader br = new BufferedReader(new FileReader("C:/test/employeedata/empempdb1.txt"));
//   while((ch=br.read())!=-1) 
	             // -1 denote or checks end of file is reached or not
//              //every time it store the value in ch and print unless end of file is reached
//   {
//	   System.out.print((char)ch);
//   }
//   br.close();
	
		
		
// Buffer readline
		
		BufferedReader br = new BufferedReader(new FileReader("C:/test/employeedata/empempdb1.txt"));	
		String s1;
		while((s1 = br.readLine())!=null)
		System.out.println(s1);
		br.close();
		

		
	}

}
