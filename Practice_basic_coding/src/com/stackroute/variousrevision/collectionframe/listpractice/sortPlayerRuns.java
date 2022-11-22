package com.stackroute.variousrevision.collectionframe.listpractice;

import java.util.Comparator;

public class sortPlayerRuns implements Comparator<Players>{

	@Override
	public int compare(Players o1, Players o2) {
	
		return o1.getNoOfRuns()-o2.getNoOfRuns();
	}

}
