package com.stackroute.session.collectionFrameworkSet5;

import java.util.Comparator;

public class rollNoSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
//		return o1.getRollNo()-o2.getRollNo();  //ascending order sorting
	return o2.getRollNo()-o1.getRollNo();	
	}

}
