package com.ae.module;

import com.ae.cart.CartImpl;
import com.ae.cart.Cart;
import com.ae.item.ItemImpl;
import com.ae.item.Item;
import com.ae.tax.ServiceTaxCalculator;
import com.ae.tax.TaxCalculator;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

class ShoppingModules extends AbstractModule {

	@Override
	protected void configure() {
		bind(TaxCalculator.class).to(ServiceTaxCalculator.class).in(
				Singleton.class);
		bind(Item.class).to(ItemImpl.class);
		bind(Cart.class).to(CartImpl.class);
	}

}