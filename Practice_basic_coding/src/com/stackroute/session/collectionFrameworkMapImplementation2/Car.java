package com.stackroute.session.collectionFrameworkMapImplementation2;

public class Car {
//Model of Car is defined
	String name;
	String color;
	String maker;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String name, String color, String maker) {
		super();
		this.name = name;
		this.color = color;
		this.maker = maker;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", maker=" + maker + "]";
	}
	
	
	
}
