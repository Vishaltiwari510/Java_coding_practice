package com.stackroute.session.oops.April22Abstraction;

public abstract class Database {
 public static final String dbName="empdb";
 public static final String userName="admin";
 public static final String password="admin";
 
 abstract String getDbConnection();
 
 public void displayDatabaseConfigProperties() {
	 System.out.println("Database name : "+dbName);
	 System.out.println("UserName : "+userName);
	 System.out.println("Password : "+password);
	 
 }
}
