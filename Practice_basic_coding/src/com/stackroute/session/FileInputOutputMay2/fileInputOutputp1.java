package com.stackroute.session.FileInputOutputMay2;

import java.io.File;
import java.io.IOException;

public class fileInputOutputp1 {

	public static void main(String[] args) {
		//It just create a file object to work on this path
		
		File file = new File("C:\\test\\employeedata\\emp\\empdata");
		if(file.exists()) {
			 if(file.isDirectory()) {
		    	   System.out.println("Directory already exist");
		       }
		       else if(file.isFile()){
		    	   System.out.println("File   exist");
		       }
		}
      
       else {
    	   System.out.println("It does not exist");
       }
		//this creates a folder with specified folder name
		//file.mkdir();
		try {
			//create a new file as per specified path
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
