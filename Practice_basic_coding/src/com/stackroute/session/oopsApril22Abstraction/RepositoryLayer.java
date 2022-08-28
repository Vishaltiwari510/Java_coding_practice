package com.stackroute.session.oopsApril22Abstraction;

public class RepositoryLayer {
void getDbConnection(Database database) {
	String message = database.getDbConnection();
	System.out.println(message);
}
}
