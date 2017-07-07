package com.tek.interview.bean;

import com.tek.interview.bean.Item;

/**
 * @author Akshay
 * Represents OrderLine with properties quantity, item.
 */
public class OrderLine {

	private int quantity;
	private Item item;

	/**
	 * @param item - item ordered.
	 * @param quantity - quantity of item ordered.
	 * @throws Exception - throws exception if item value is null.
	 */
	public OrderLine(Item item, int quantity) throws Exception {
		if (item == null) {
			System.err.println("ERROR - Item is NULL");
			throw new Exception("Item is NULL");
		}
		assert quantity > 0;
		this.item = item;
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public int getQuantity() {
		return quantity;
	}
}
