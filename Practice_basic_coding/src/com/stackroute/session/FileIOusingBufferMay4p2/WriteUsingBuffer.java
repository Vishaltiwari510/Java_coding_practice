package com.stackroute.session.FileIOusingBufferMay4p2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingBuffer {

	public static void main(String[] args) throws IOException {
		BufferedWriter bf = new BufferedWriter(new FileWriter("C:/test/employeedata/empempdb1.txt", true));
	bf.write("computer");
	bf.close();
	}

}
