package com.ae.item;

import com.ae.item.ItemDefine.ItemType;

/**
 * All the item related properties mentioned in the American Express problem have been defined here
 * 
 * @author manoj
 * 
 */
public interface Item {

	String getItemDescription();

	void setItemDescription(String description);

	float getItemPrice();

	void setItemPrice(float price);

	void setItemType(ItemType itemType);

	boolean isItemImported();

	boolean isItemExempted();

	float getItemPriceWithTax();

	float getItemSaleTax();
}