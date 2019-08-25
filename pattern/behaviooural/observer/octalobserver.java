package com.bridgelabz.pattern.behaviooural;

public class octalobserver extends observer
{


public  octalobserver(subject subject)
{
	this.subject=subject;
	this.subject.attach(this);
}

@Override
public void update() {
	// TODO Auto-generated method stub
	System.out.println("octal:"+Integer.toOctalString(subject.getState()));
}
}
