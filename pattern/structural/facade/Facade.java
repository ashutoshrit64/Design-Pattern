package com.bridgelabz.pattern.structural;

import java.io.IOException;
import java.util.Scanner;

public class Facade {
static Scanner scan=new Scanner(System.in);
	public static void main(String args[]) throws NumberFormatException, IOException {
		boolean flag=true;
			do {
			System.out.print(" _______________________\n");
			System.out.print("|______Mobile Shop______| \n");
			System.out.print("|                       |  \n");
			System.out.print("|  1. IPHONE.           |  \n");
			System.out.print("|  2. SAMSUNG.          |  \n");
			System.out.print("|  3. BLACKBERRY.       |  \n");
			System.out.print("|  4. Exit.             |    \n");
			System.out.print("|_______________________| \n");
			System.out.println();
			System.out.print("Enter your choice: ");
//
//			choice = Utility.getInteger();
			int choice=scan.nextInt();
			shop sk=new shop();
			System.out.println();
			switch (choice) {
			case 1: {
				sk.microsoftSale();
			}
				break;
			case 2: {
				sk.samsungSale();
			}
				break;
			case 3: {
				sk.BlackberrySale();
			}
				break;
			default: {
				System.out.println("Nothing You purchased");
			}
				return;
			}

		} while (flag );
	}
}

