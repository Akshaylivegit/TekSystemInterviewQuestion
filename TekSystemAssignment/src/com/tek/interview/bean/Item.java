package com.tek.interview.bean;


/**
 * @author Akshay
 * Represents an Item with properties description, price.
 */
public class Item {

	private String description;
	private float price;

	public Item(String description, float price) {
		super();
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public float getPrice() {
		return price;
	}
}

