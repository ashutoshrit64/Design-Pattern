package com.bridgelabz.pattern.behaviooural;

public class observerpattern {
	public static void main(String[] args) {
		subject subject = new subject();

	//	new HexaObserver(subject);
		octalobserver oct=new octalobserver(subject);
		//new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		oct.update();
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}

