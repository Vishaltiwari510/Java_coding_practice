package com.stackroute.session.oopsApril22AbstractionbyInterface;

public class Oracle implements IDatabase {

	@Override
	public String getDbConnection() {
		//dbName ="student";
		//This gives error because by default interface properties are final
		return "Connected to Db : "+dbName +" from Oracle";
	}

}
