package com.stackroute.practice.collectionFrameworkAssignment3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;

//Question --> Create a queue of players and sort them based on number of match played





import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

//Question-1--> Create a queue of players with max 11 players and sort them based on number of runs scored
public class PlayersMain {

	public static void main(String[] args) {
	
		PriorityBlockingQueue<Players> players = new PriorityBlockingQueue<Players>(11, new sortPlayerRuns());
		
		Players player1 = new Players("virat", 18, "india", 250, 12000, 50);
		Players player2 = new Players("babar", 3, "pakistan", 150, 8000, 10);
		Players player3 = new Players("stokes", 24, "england", 200, 6000, 100);
		Players player4 = new Players("warner", 6, "austrlia", 190, 9000, 65);
		Players player5 = new Players("deviliers", 66, "sauth africa", 350, 10000, 34);
		Players player6 = new Players("wiliamson", 23, "newzealand", 215, 1000, 54);
		Players player7 = new Players("pollard", 45, "westindies", 271, 8100, 26);
		Players player8 = new Players("sikandar", 27, "zimbabve", 189, 9100, 87);
		Players player9 = new Players("ikbal", 76, "bangladesh", 110, 9300, 61);
		Players player10 = new Players("rashid", 19, "afghanistan", 231, 6500, 32);
		Players player11 = new Players("kinchit", 68, "hongkong", 117, 3400, 89);
	
		
	players.add(player1);
	players.add(player2);
	players.add(player3);
	players.add(player4);
	players.add(player5);
	players.add(player6);
	players.add(player7);
	players.add(player8);
	players.add(player9);
	players.add(player10);
	players.add(player11);

	System.out.println("Before sorting ----");
	System.out.println(players);
	

	System.out.println("After sorting ----------");
	 Object[] arr = new Object[players.size()];
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = players.remove();
	    }

	    System.out.println(Arrays.toString(arr));
	
		
	
	

	}

}
