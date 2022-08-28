package com.stackroute.session.oopsApril22Abstraction;

public class Oracle extends Database {

	@Override
	String getDbConnection() {
		super.displayDatabaseConfigProperties();
		return "Connected to Db : "+dbName +" from Oracle";
	}

}
