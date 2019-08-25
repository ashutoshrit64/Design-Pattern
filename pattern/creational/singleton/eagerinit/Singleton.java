package com.bridgelabz.pattern;

public class Singleton 
{
private static final Singleton instance=new Singleton();
Singleton(){
	
}
void method()
{
	System.out.println("how are you....");
}
	public static Singleton getInstance()
	{
		return instance;
		
	}
	
	
	
}
