package com.stackroute.practice.collectionFrameworkAssignment4;

public class Players {
 
	private String playerName;
	private int playerid;
	private String team;
	private int noOfMatch;
	private int noOfRuns;
	private int noOfWickets;
	
	
	public Players() {
		
	}


	public Players(String playerName, int playerid, String team, int noOfMatch, int noOfRuns, int noOfWickets) {
		super();
		this.playerName = playerName;
		this.playerid = playerid;
		this.team = team;
		this.noOfMatch = noOfMatch;
		this.noOfRuns = noOfRuns;
		this.noOfWickets = noOfWickets;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public int getPlayerid() {
		return playerid;
	}


	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public int getNoOfMatch() {
		return noOfMatch;
	}


	public void setNoOfMatch(int noOfMatch) {
		this.noOfMatch = noOfMatch;
	}


	public int getNoOfRuns() {
		return noOfRuns;
	}


	public void setNoOfRuns(int noOfRuns) {
		this.noOfRuns = noOfRuns;
	}


	public int getNoOfWickets() {
		return noOfWickets;
	}


	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}


	@Override
	public String toString() {
		return "Players [playerName=" + playerName + ", playerid=" + playerid + ", team=" + team + ", noOfMatch="
				+ noOfMatch + ", noOfRuns=" + noOfRuns + ", noOfWickets=" + noOfWickets + "]\n";
	}
	
	
	
}
