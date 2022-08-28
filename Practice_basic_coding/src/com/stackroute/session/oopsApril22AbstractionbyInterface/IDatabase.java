package com.stackroute.session.oopsApril22AbstractionbyInterface;

public interface IDatabase {
	String dbName="empdb";
	String userName="admin";
	String password="admin";
	int portNo=3306;
	
	//By default abstract method are public and abstract so no need to mention 
	String getDbConnection();
	
}
