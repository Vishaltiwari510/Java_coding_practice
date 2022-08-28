package com.stackroute.session.oopsApril22AbstractionbyInterface;

public class Mysql implements IDatabase{

	@Override
	public String getDbConnection() {
		
		return "Database connected to " +dbName+": from MySql";
	}

}
