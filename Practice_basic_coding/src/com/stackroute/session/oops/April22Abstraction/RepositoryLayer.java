package com.stackroute.session.oops.April22Abstraction;

public class RepositoryLayer {
void getDbConnection(Database database) {
	String message = database.getDbConnection();
	System.out.println(message);
}
}
