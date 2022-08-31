package com.stackroute.session.FileIO4MayP1;

import java.io.FileOutputStream;
import java.io.IOException;

public class WrittingToFile {

	public static void main(String[] args) throws IOException{
		
		int i;
		FileOutputStream fout = new FileOutputStream("C:/test/employeedata/empempdb1.txt", true);
		String s = "TATA";
		char ch[] = s.toCharArray();
		for( i=0; i<s.length(); i++) {
			fout.write(ch[i]);
			
		}
		fout.close();

	}

}
