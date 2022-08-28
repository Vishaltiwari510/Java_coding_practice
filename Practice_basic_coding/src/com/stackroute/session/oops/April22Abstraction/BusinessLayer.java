package com.stackroute.session.oops.April22Abstraction;

public class BusinessLayer {
RepositoryLayer repository = new RepositoryLayer();

void processRequest() {
	repository.getDbConnection(new Mysql());
}
}
