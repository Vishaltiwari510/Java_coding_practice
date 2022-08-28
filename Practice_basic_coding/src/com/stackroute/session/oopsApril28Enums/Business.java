package com.stackroute.session.oopsApril28Enums;

public class Business {

	
	public void doProcess(Difficulty difficulty) {
		switch(difficulty) {
		case BEGINNER:
			invokeBeginner();
			break;
		case INTERMEDIATE:
			invokeIntermediate();
			break;
		case EXPERT:
			invokeExpert();
			break;
		}
	}

	private void invokeExpert() {
		
		System.out.println("Expert is invoked");
	}

	private void invokeIntermediate() {
		
		System.out.println("Intermediate is invoked");
	}

	private void invokeBeginner() {
		
		System.out.println("Beginner is invoked");
	}
}
