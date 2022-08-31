package com.stackroute.session.BuilderDesignPattern29April;

public class Employee {
    int id;
	String name;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public Employee setId(int id) {
		this.id = id; 
		return this;
	}

	public String getName() {
		return name;
	}

	public Employee setName(String name) {
		this.name = name;
		return	this;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	
	
	
}
