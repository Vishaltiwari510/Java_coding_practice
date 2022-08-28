package com.stackroute.session.oopsApril22AbstractionbyInterface;



public class RepositoryLayer {
	void getDbConnection(IDatabase database) {
		String message = database.getDbConnection();
		System.out.println(message);
	}
}
