package com.bridgelabz.pattern;

public class MainOS {
	public static os getOS(String str) {

		
		if (str.equals("Android")) {
			return new Android();
		} else if (str.equals("Windows")) {
			return new win();
		} else if (str.equals("IOS")) {
			return new ios();
		}
		return null;

	}
}
