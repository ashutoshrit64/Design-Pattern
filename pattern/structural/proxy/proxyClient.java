package com.bridgelabz.pattern.structural;

public class proxyClient {

    public static void main(String[] args)   
    {  
        officeInternetAccess access = new proxyInternetAccess("Ashutosh");  
        access.grantInternetAccess();  
    }  
}
