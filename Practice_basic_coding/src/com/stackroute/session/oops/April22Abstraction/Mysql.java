package com.stackroute.session.oops.April22Abstraction;

public class Mysql extends Database {

	@Override
	String getDbConnection() {
		super.displayDatabaseConfigProperties();
		return "Database connected to " +dbName+": from MySql";
	}

}
