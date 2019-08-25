package com.bridgelabz.pattern;

public class LazyInitialization {
private static LazyInitialization instance;
LazyInitialization()
{
	
}
public static LazyInitialization getInstance()
{
	if(instance==null)
	{
		instance=new LazyInitialization();
		
	}
	return instance;
}
}
