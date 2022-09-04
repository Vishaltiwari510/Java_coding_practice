package com.stackroute.practice.collectionFrameworkAssignment2;

import java.util.Comparator;

public class sortPlayerMatches implements Comparator<Players>{

	@Override
	public int compare(Players o1, Players o2) {
		
		return o1.getNoOfMatch()-o2.getNoOfMatch();
	}

}
