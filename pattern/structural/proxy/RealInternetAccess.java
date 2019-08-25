package com.bridgelabz.pattern.structural;

public class RealInternetAccess {
	private String employeeName;

	public RealInternetAccess(String empName)
	{
		this.employeeName = empName;
	}

	public void grantInternetAccess() {
		System.out.println("Internet Access granted for employee: " + employeeName);
	}

}
