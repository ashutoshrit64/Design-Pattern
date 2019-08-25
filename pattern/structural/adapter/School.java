package com.bridgelabz.pattern.structural;

public class School {
	private pen p;

	void writeAssignment(String str)
	{
		p.write(str);
	}

	public pen getP()
	{
		return p;
	}

	public void setP(pen p) {
		this.p = p;
	}
}
