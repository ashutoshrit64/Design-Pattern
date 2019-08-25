package com.bridgelabz.pattern.structural;

public class Adaptermain
{
	static pen p = new PenAdapter();

	public static void main(String[] args) {
		
		School wa = new School();
		wa.setP(p);
		wa.writeAssignment("no,i m not interested in assignments..");
	}
}
