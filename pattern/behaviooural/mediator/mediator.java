package com.bridgelabz.pattern.behaviooural;

public class mediator {
public static void main(String[] args) {
		
		user robert = new user("Robert");
		user john = new user("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
