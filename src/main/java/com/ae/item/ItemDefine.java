package com.ae.item;

/**
 * Item related Define
 * 
 * @author manoj
 * 
 */
public class ItemDefine {
	public enum ItemType {
		MEDICAL(true, false), FOOD(true, false), OTHERS(false, false);
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