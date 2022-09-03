package com.stackroute.practice.collectionFrameworkAssignment1;

import java.util.Comparator;

public class sortPlayerWicket implements Comparator<Players>{

	@Override
	public int compare(Players o1, Players o2) {
		
		return o1.getNoOfWickets()-o2.getNoOfWickets();
	}

}
