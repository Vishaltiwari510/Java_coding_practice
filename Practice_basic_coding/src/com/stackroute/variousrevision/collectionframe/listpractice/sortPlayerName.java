package com.stackroute.variousrevision.collectionframe.listpractice;

import java.util.Comparator;

public class sortPlayerName implements Comparator<Players>{

	@Override
	public int compare(Players o1, Players o2) {
		
		return o1.getPlayerName().compareTo(o2.getPlayerName());
	}

}
