package com.stackroute.session.oops.April22Abstraction;

public class Oracle extends Database {

	@Override
	String getDbConnection() {
		super.displayDatabaseConfigProperties();
		return "Connected to Db : "+dbName +" from Oracle";
	}

}
