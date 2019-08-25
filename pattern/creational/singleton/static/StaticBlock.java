package com.bridgelabz.pattern;

public class StaticBlock {

	private static final StaticBlock instance;
	
	private StaticBlock()
	{
		
	}
	static {
		try {
			instance=new StaticBlock();
			
		}catch(Exception e)
		{
			throw new RuntimeException("error");
		}
	}
	public static StaticBlock getInstance() {
		return  instance;
	}
}
