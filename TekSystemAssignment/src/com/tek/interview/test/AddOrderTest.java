package com.tek.interview.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tek.interview.bean.OrderLine;
import com.tek.interview.calculate.Order;

public class AddOrderTest {

	@Test()
	public void test() {
		OrderLine orderLine = null;
		Order order = new Order();
		try {
			order.add(orderLine);
			fail("Expected Illegal argument exception");
		} catch (Exception e) {
			System.out.println("IllegalArgumentException expected");
		}
	}

}
