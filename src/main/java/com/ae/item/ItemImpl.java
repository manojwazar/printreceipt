package com.ae.item;

import com.ae.item.ItemDefine.ItemType;
import com.ae.tax.TaxCalculator;
import com.google.inject.Inject;

/**
 * Item Implementation
 * 
 * @author manoj
 * 
 */
public class ItemImpl implements Item {
	protected float itemPrice;
	private String name;
	private ItemType itemType;

	@Inject
	private TaxCalculator CALCULATOR;

	public String getItemDescription() {
		return name;
	}

	public void setItemDescription(String itemName) {
		name = itemName;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float price) {
		itemPrice = price;

	}

	public void setItemType(ItemType type) {
		itemType = type;
	}

	public boolean isItemImported() {
		return itemType.isImported();
	}

	public boolean isItemExempted() {
		return itemType.isExempted();
	}

	public float getItemPriceWithTax() {
		return getItemSaleTax() + getItemPrice();
	}

	public float getItemSaleTax() {
		return (CALCULATOR.calculateTax(this));
	}

	public String toString() {
		return 1 + " : Item Name - " + name + " : Item Price - "
				+ getItemPrice() + " : Item Tax - " + getItemSaleTax();
	}
}