package com.bridgelabz.pattern.structural;

public class proxyInternetAccess implements officeInternetAccess 
{
	private String employeeName;
	private RealInternetAccess realaccess;

	public proxyInternetAccess(String employeeName)
	{
		this.employeeName = employeeName;
	}

	public void grantInternetAccess() {
		if (getRole(employeeName) > 4) {
			realaccess = new RealInternetAccess(employeeName);
			realaccess.grantInternetAccess();
		} else {
			System.out.println("No Internet access granted. Your job level is below 5");
		}
	}

	public int getRole(String emplName) {
		// Check role from the database based on Name and designation
		// return job level or job designation.
		return 6;
	}
}
