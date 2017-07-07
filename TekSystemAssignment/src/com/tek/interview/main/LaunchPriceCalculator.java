package com.tek.interview.main;

import java.util.HashMap;
import java.util.Map;

import com.tek.interview.bean.Item;
import com.tek.interview.calculate.Order;
import com.tek.interview.bean.OrderLine;
import com.tek.interview.calculate.PriceCalculator;

public class LaunchPriceCalculator {

	public static void main(String[] args) throws Exception {

		Map<String, Order> orderMap = new HashMap<String, Order>();

		Order order1 = new Order();

		order1.add(new OrderLine(new Item("book", (float) 12.49), 1));
		order1.add(new OrderLine(new Item("music CD", (float) 14.99), 1));
		order1.add(new OrderLine(new Item("chocolate bar", (float) 0.85), 1));

		orderMap.put("Order 1", order1);

		//Create a new instance of order for each new order.
		Order order2 = new Order();
		order2.add(new OrderLine(new Item("imported box of chocolate", 10), 1));
		order2.add(new OrderLine(new Item("imported bottle of perfume", (float) 47.50), 1));

		orderMap.put("Order 2", order2);

		Order order3 = new Order();
		order3.add(new OrderLine(new Item("Imported bottle of perfume", (float) 27.99), 1));
		order3.add(new OrderLine(new Item("bottle of perfume", (float) 18.99), 1));
		order3.add(new OrderLine(new Item("packet of headache pills", (float) 9.75), 1));
		order3.add(new OrderLine(new Item("box of imported chocolates", (float) 11.25), 1));

		orderMap.put("Order 3", order3);

		new PriceCalculator().calculate(orderMap);

	}
}
