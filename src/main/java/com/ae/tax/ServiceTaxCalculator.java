package com.ae.tax;

import com.ae.item.Item;
import com.ae.tax.TaxDefine.TaxType;

/**
 * Based on the American Express problem statement
 * Service taxes calculation logic is defined here based on various criteria 
 * 
 * @author manoj
 * 
 */
public class ServiceTaxCalculator implements TaxCalculator {
	private static final float ROUNDOFF = 0.05f;

	public float calculateTax(Item item) {
		return roundOffTax(getItemTaxType(item).getApplicableTax()
				* item.getItemPrice());
	}

	private TaxType getItemTaxType(Item item) {
		if (item.isItemImported() && !item.isItemExempted()) {
			return TaxType.BOTH;
		} else if (item.isItemImported() && item.isItemExempted()) {
			return TaxType.IMPORTED;
		} else if (!item.isItemImported() && !item.isItemExempted()) {
			return TaxType.BASIC;
		}
		return TaxType.NA;
	}

	private float roundOffTax(float tax) {
		return (float) Math.ceil(tax / ROUNDOFF) * ROUNDOFF;
	}

}