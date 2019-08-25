package com.bridgelabz.pattern.behaviooural;

 

public interface ShoppingCartVisitor {
	int visit(Book book);


	int visit(fruit fruit);
}
