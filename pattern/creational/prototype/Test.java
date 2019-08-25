package com.bridgelabz.pattern;

public class Test implements Cloneable{
	public static void main(String args[]) throws CloneNotSupportedException {

		ShowRoom sr = new ShowRoom();
		sr.setName("Amar");
		sr.insertData();
		System.out.println(sr);
		System.out.println();
		
//		sr.getVehicles().remove(2);
		
		ShowRoom sr1 = (ShowRoom) sr.clone();
		sr1.setName("Ashutsoh");
		System.out.println(sr1);

	}
}
