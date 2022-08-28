package com.stackroute.session.oopsApril22AbstractionbyInterface;



public class BusinessLayer {
	RepositoryLayer repository = new RepositoryLayer();

		public void processRequest() {
		repository.getDbConnection(new Mysql());
	}
}
