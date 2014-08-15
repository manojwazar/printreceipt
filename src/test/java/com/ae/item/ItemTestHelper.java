package com.ae.item;

import com.ae.item.ItemDefine.ItemType;

import com.ae.item.Item;
import com.ae.module.InjectorFactory;

public class ItemTestHelper {
	/**
	 * Data set
	 */
	public static Object[][] ITEM_LIST = new Object[][] {
			{ "design patterns", 12.49f, ItemType.BOOK, 12.49f },
			{ "Music CD", 14.99f, ItemType.OTHERS, 16.49f },
			{ "milk", 0.85f, ItemType.FOOD, 0.85f },
			{ "imported box of chocolates", 10.00f, ItemType.IMPORTED_FOOD,
					10.50f },
			{ "imported item", 47.50f, ItemType.IMPORTED_OTHERS,
					54.65f },
			{ "imported item2", 27.99f, ItemType.IMPORTED_OTHERS,
					32.19f },
			{ "lotion", 18.99f, ItemType.OTHERS, 20.89f },
			{ "advil", 9.75f, ItemType.MEDICAL, 9.75f },
			{ "bread", 11.25f, ItemType.IMPORTED_FOOD,
					11.85f } };

	/**
	 * Helper method to create Item
	 * 
	 * @param description
	 * @param price
	 * @param itemType
	 * @return
	 */
	public static Item createItem(String description, float price,
			ItemType itemType) {
		Item item = InjectorFactory.getInjector().getInstance(Item.class);
		item.setItemType(itemType);
		item.setItemPrice(price);
		item.setItemDescription(description);
		return item;
	}
}