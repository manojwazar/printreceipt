package com.ae.item;

import com.ae.item.ItemDefine.ItemType;

/**
 * Define Item related properties
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