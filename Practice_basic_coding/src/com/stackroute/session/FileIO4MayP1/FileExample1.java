package com.stackroute.session.FileIO4MayP1;

import java.io.File;
import java.io.IOException;

public class FileExample1 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\\\test\\\\employeedata\\\\emp\\\\empdb.txt");
        f1.createNewFile();
        // f1.delete();  it can delete file
		System.out.println("is exist : "+f1.exists());
		System.out.println("File size : "+f1.length());
		System.out.println("FileName : "+f1.getName());
		System.out.println("can file read :"+f1.canRead());
		System.out.println("can file write :"+f1.canWrite());
	}

}
