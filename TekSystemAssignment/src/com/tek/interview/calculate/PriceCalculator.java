package com.tek.interview.calculate;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Map;

import com.tek.interview.bean.Item;
import com.tek.interview.calculate.Order;

/**
 * @author Akshay 
 * Class used to calculate and display price for each order and
 * items within that order.
 */
public class PriceCalculator {

	/**
	 * Rounds up value upto two decimal places.
	 * 
	 * @param value
	 *            - value that needs to be round up.
	 * @return
	 * 		- roundup value.
	 */		
	public static double rounding(double value) {
		DecimalFormat df = new DecimalFormat("0.00");
		double finalValue = Double.valueOf(df.format(value));
		/*try {
			finalValue =  (double) df.parse(formate);
		} catch (ParseException e) {
			System.err.println(e);
		}*/
		return finalValue;
	}

	/**
	 * Receives a collection of orders. For each order, iterates on the order
	 * lines and calculate the total price which is the item's price * quantity * taxes. 
	 * For each order, print the total Sales Tax paid and Total price without taxes for this order.
	 *
	 * @param orderMap
	 *            - Map representing a collection of all the orders.
	 */
	public void calculate(Map<String, Order> orderMap) {

		double grandTotal = 0;

		// Iterate through the orders in the map.
		for (Map.Entry<String, Order> entry : orderMap.entrySet()) {
			System.out.println("*******" + entry.getKey() + "*******");

			Order order = entry.getValue();

			double totalTax = 0;
			double orderTotal = 0;

			// Iterate through the items in the order
			for (int i = 0; i < order.size(); i++) {
				Item item = order.get(i).getItem();
				double quantity = order.get(i).getQuantity();
				// Calculate the taxes
				double tax = calculateTax(item, quantity);
				// Calculate the total price for each item.
				double totalprice = rounding(item.getPrice() + tax);
				// Print out the item's total price
				System.out.println(item.getDescription() + "(price with tax): " + rounding(totalprice*quantity));

				// Keep a running total of taxes for a order.
				totalTax += tax;
				// Keep a running total of item prices for a order without taxes.
				orderTotal += rounding(item.getPrice()*quantity);
			}

			// Print out the total taxes for a order.
			System.out.println("Sales Tax for Order: " + rounding(totalTax));

			// Print out the total price of order without tax.
			System.out.println("Total Price for order(without tax): " + rounding(orderTotal));
			grandTotal += orderTotal;
		}
		// Print out sum of all orders without taxes.
		System.out.println("Sum of orders(without tax): " + rounding(grandTotal));

		// Note: All the values are round up using rounding() method to display the values upto two decimal places. 
		// use of Math.floor() method is avoided because it displays value without decimal places.
	}
	
	/**
	 * @param item - item whose tax need to be calculated.
	 * @return - calculated tax value.
	 */
	public static double calculateTax(Item item, double quantity){
		double tax = 0;
		if (item.getDescription().toLowerCase().contains("imported")) {
			tax = rounding(item.getPrice() * quantity * 0.15); // Extra 5% tax on imported items.
		} else {
			tax = rounding(item.getPrice() * quantity * 0.10);
		}
		return tax;
	}
}
