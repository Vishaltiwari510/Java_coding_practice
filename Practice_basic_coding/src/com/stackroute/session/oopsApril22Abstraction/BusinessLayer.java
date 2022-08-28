package com.stackroute.session.oopsApril22Abstraction;

public class BusinessLayer {
RepositoryLayer repository = new RepositoryLayer();

void processRequest() {
	repository.getDbConnection(new Mysql());
}
}
