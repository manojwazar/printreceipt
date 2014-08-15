package com.ae.cart;

/**
 * Based on the American Express problem details
 * Cart object is created which will have the list of items and their cost details
 * 
 * 
 * @author manoj
 * 
 */

import com.ae.item.Item;

public interface Cart {
	public void addItemToCart(Item item);

	public void calculateAndPrintReceiptWithTax();

	public float getTotalCost();

	public float getSalesTax();
}