package com.bridgelabz.pattern.structural;

public class PenAdapter implements pen 
{

	PilotPen PP = new PilotPen();

	public void write(String str) {
		PP.mark(str);
	}
	
	
	
}
