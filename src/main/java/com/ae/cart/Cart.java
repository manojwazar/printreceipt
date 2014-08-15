package com.ae.cart;

import com.ae.item.Item;

public interface Cart {
	public void addItemToCart(Item item);

	public void calculateAndPrintReceiptWithTax();

	public float getTotalCost();

	public float getSalesTax();
}