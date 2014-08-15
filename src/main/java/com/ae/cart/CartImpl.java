package com.ae.cart;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;

import com.ae.item.Item;

public class CartImpl implements Cart {

	private List<Item> itemList;
	private float saleTax;
	private float totalCost;
	private static final Format FORMATTER = new DecimalFormat("0.00");

	public CartImpl() {
		itemList = new ArrayList<Item>();
	}

	public void addItemToCart(Item item) {
		itemList.add(item);
	}

	public void calculateAndPrintReceiptWithTax() {
		// resetCart();
		StringBuilder buffer = new StringBuilder();
		for (Item item : itemList) {
			buffer.append("\n").append(item.toString());
			totalCost += item.getItemPriceWithTax();
			saleTax += item.getItemSaleTax();
		}
		buffer.append("\nSales Tax:" + FORMATTER.format(saleTax));
		buffer.append("\nTotal :" + totalCost);
		System.out.println(buffer.toString());
	}

	public float getTotalCost() {
		return totalCost;
	}

	public float getSalesTax() {
		return Float.valueOf(FORMATTER.format(saleTax));
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		for (Item item : itemList) {
			buffer.append("\n").append(item.toString());
		}
		return buffer.toString();
	}

}