package com.tek.interview.calculate;

import java.util.ArrayList;
import java.util.List;

import com.tek.interview.bean.OrderLine;

/**
 * @author Akshay
 * Represents Order with property orderLines representing a list of ordered items. 
 */
public class Order {

	private List<OrderLine> orderLines = new ArrayList<>();

	/**
	 * @param o - represents a single item in order. 
	 * @throws Exception - throws exception if OrderLine is null.
	 */
	public void add(OrderLine orderLine) throws Exception {
		if (orderLine == null) {
			System.err.println("ERROR - Order is NULL");
			throw new IllegalArgumentException("Order is NULL");
		}
		orderLines.add(orderLine);
	}

	public int size() {
		return orderLines.size();
	}

	public OrderLine get(int i) {
		return orderLines.get(i);
	}

	public void clear() {
		this.orderLines.clear();
	}
}
