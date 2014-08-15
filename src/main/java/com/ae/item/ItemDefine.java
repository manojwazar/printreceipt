package com.ae.item;

/**
 * As per the problem statement of American Express,
 * We have Item with various properties like name, type etc 
 * We also have different taxes based on the type like imported duty exempt, sales taxes etc 
 * 
 * 
 * @author manoj
 * 
 */
public class ItemDefine {
	public enum ItemType {
		BOOK(false, false), MEDICAL(true, false), FOOD(true, false), OTHERS(
				false, false), IMPORTED_BOOK(true, true), IMPORTED_MEDICAL(
				true, true), IMPORTED_FOOD(true, true), IMPORTED_OTHERS(false,
				true);
		private boolean isExempted;
		private boolean isImported;

		private ItemType(boolean exepmted, boolean imported) {
			isExempted = exepmted;
			isImported = imported;
		}

		public boolean isImported() {
			return isImported;
		}

		public boolean isExempted() {
			return isExempted;
		}

	}
}