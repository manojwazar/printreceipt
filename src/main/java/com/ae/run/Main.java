package com.ae.run;

import java.util.Scanner;

import com.ae.cart.Cart;
import com.ae.item.ItemDefine.ItemType;
import com.ae.item.Item;
import com.ae.module.InjectorFactory;

/**
 * command line Test program
 * 
 * @author manoj
 * 
 */
public class Main {

	enum ItemTypeList {
		BOOK("DesignPatterns"), MUSIC_CD("Music CD"), CHOCOLATE("Chocolate"), PERFUME(
				"Perfume"), PILLS("Headache Pills");
		private String itemName;

		private ItemTypeList(String name) {
			itemName = name;
		}

		public String getItemName() {
			return itemName;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ItemTypeList list[] = ItemTypeList.values();
		StringBuilder buffer = new StringBuilder();
		int count = 1;
		for (ItemTypeList item : list) {
			buffer.append(count++).append(" :")
					.append(item.getItemName() + "\n");
		}
		String productList = "\n Select Item : \n" + buffer.toString();

		buffer.delete(0, buffer.length());

		ItemType[] itemTypes = ItemType.values();

		for (ItemType itemType : itemTypes) {
			buffer.append(itemType.ordinal()).append(" :")
					.append(itemType.name() + "\n");
		}
		String itemTypeList = "\n Select Item type: \n" + buffer.toString();

		Cart cart = InjectorFactory.getInjector().getInstance(Cart.class);
		for (int i = 0; i < 2; i++) {

			// while (true) {
			System.out.println(productList);
			int product = input.nextInt();
			if (product == 0) {
				break;
			}
			Item item = InjectorFactory.getInjector().getInstance(Item.class);
			item.setItemDescription(list[product - 1].getItemName());
			System.out.println("Enter Item Price");
			item.setItemPrice(input.nextFloat());
			System.out.println(itemTypeList);
			item.setItemType(itemTypes[input.nextInt()]);

			cart.addItemToCart(item);

			System.out
					.println("Item with Tax : " + +item.getItemPriceWithTax());
			System.out
					.println("------------------------------------------------- \n");


			// }

		}
		System.out.println("Final Sale Receipt \n");

		cart.calculateAndPrintReceiptWithTax();

	}

}