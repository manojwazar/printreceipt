package com.ae.tax;

/**
 * Based on the American Express problem statement
 * the taxes and their properties and calculation logic are defined here
 * 
 * @author manoj
 * 
 */
public class TaxDefine {
	public enum TaxType {
		NA(0), BASIC(10.0f / 100), IMPORTED((5.0f / 100)), BOTH(BASIC
				.getApplicableTax() + IMPORTED.getApplicableTax());
		private float applicableTax;

		private TaxType(float tax) {
			applicableTax = tax;
		}

		public float getApplicableTax() {
			return applicableTax;
		}
	}
}