package com.bridgelabz.pattern.structural;

public class shop {
private mobiledata Blackberry;
private microsoft microsoft;
private samsung samsung;
public shop()
{
	Blackberry=new Blackberry();
	microsoft= new microsoft();
	samsung= new samsung();
}
public void BlackberrySale()
{
	Blackberry.mobilename();
	Blackberry.price();
}
public void microsoftSale()
{
	microsoft.mobilename();
	microsoft.price();
}
public void samsungSale()
{
	samsung.mobilename();
	samsung.price();
}
}
