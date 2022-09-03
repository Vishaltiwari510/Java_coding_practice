package com.stackroute.practice.collectionFrameworkAssignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class PlayersMain {

	public static void main(String[] args) {
		System.out.println("Enter the category based on which you want to sort student data");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		Players player1 = new Players("virat", 18, "india", 250, 12000, 50);
		Players player2 = new Players("babar", 3, "pakistan", 150, 8000, 10);
		Players player3 = new Players("stokes", 24, "england", 200, 6000, 100);
		Players player4 = new Players("warner", 6, "austrlia", 190, 9000, 65);
		Players player5 = new Players("deviliers", 66, "sauth africa", 350, 10000, 34);
		Players player6 = new Players("wiliamson", 23, "newzealand", 230, 11000, 29);
	
	ArrayList<Players> players = new ArrayList<>();
	players.add(player1);
	players.add(player2);
	players.add(player3);
	players.add(player4);
	players.add(player5);
	players.add(player6);
	
	if(choice==1) {
		Collections.sort(players, new sortPlayerName());
		
		
	}
	else if(choice==2) {
		Collections.sort(players, new sortPlayerTeam());
		
	}
	
else if(choice==3) {
	Collections.sort(players, new sortPlayerRuns());
	
	}
	
else if(choice==4) {
	Collections.sort(players, new sortPlayerWicket());
	
}
	
else if(choice==5) {
	Collections.sort(players, new sortPlayerMatches());
	
}
	for(Players play:players) {
		System.out.println(play);
	}
	

	}

}
