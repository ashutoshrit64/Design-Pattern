package com.bridgelabz.pattern.behaviooural;

public class client {
	public static void main(String[] args) {
		itemElement[] items = new itemElement[] {new Book(20, "ads"), new Book(100, "sfsd"),
				new fruit(10, 2, "Banana"), new fruit(5, 5, "Apple") };

		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static int calculatePrice(itemElement[] items) {
		ShoppingCartVisitor visitor = new shoppingcartimpl();
		int sum = 0;
		for (itemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}
 
