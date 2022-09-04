package com.stackroute.practice.collectionFrameworkAssignment2;

//Question --> Create a queue of players and sort them based on number of match played


import java.util.Iterator;
import java.util.PriorityQueue;


public class PlayersMain {

	public static void main(String[] args) {
	
		
		Players player1 = new Players("virat", 18, "india", 250, 12000, 50);
		Players player2 = new Players("babar", 3, "pakistan", 150, 8000, 10);
		Players player3 = new Players("stokes", 24, "england", 200, 6000, 100);
		Players player4 = new Players("warner", 6, "austrlia", 190, 9000, 65);
		Players player5 = new Players("deviliers", 66, "sauth africa", 350, 10000, 34);
		Players player6 = new Players("wiliamson", 23, "newzealand", 230, 11000, 29);
	
		PriorityQueue<Players> players = new PriorityQueue<>(new sortPlayerMatches());
	players.add(player1);
	players.add(player2);
	players.add(player3);
	players.add(player4);
	players.add(player5);
	players.add(player6);
	
	
	
//	System.out.println(players.poll());
//	System.out.println(players.poll());
//	System.out.println(players.poll());
//	System.out.println(players.poll());
//	System.out.println(players.poll());
//	System.out.println(players.poll());
	

	 Iterator<Players> itr=players.iterator();  
	    while(itr.hasNext()){  
	    	System.out.println(players.poll());
	    } 
		
	
	

	}

}
