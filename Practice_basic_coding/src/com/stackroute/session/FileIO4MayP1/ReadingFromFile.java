package com.stackroute.session.FileIO4MayP1;

import java.io.FileInputStream;

import java.io.IOException;

public class ReadingFromFile {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("C:/test/employeedata/empempdb1.txt");
    int j;
		do {
	    	j = fis.read();
	    	if(j!=-1) {
	    		System.out.println((char)j);
	    	}
	    }while(j!=-1);
	    fis.close();
	}

}
