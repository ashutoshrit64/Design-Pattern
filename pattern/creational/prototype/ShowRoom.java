package com.bridgelabz.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class ShowRoom implements Cloneable
{
	static Scanner scan=new Scanner(System.in);
	String name;

	List<vehicle> vehicles = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public void insertData() {
		
		System.out.println("Enter number of vehicles ");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter vehicle name : ");
			String name = scan.next();
			System.out.println("Enter vehicle model : ");
			String model = scan.next();
			System.out.println("Enter vehicle price : ");
			int price = scan.nextInt();

			vehicle vehicles = new vehicle();
			vehicles.setName(name);
			vehicles.setModel(model);
			vehicles.setPrice(price);
			getVehicles().add(vehicles);
		}
	}

	@Override
	public String toString() {
		return "ShowRoom [name=" + name + ", vehicles=" + vehicles + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
