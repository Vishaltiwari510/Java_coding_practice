package com.stackroute.session.oopsApril22Abstraction;

public class Mysql extends Database {

	@Override
	String getDbConnection() {
		super.displayDatabaseConfigProperties();
		return "Database connected to " +dbName+": from MySql";
	}

}
