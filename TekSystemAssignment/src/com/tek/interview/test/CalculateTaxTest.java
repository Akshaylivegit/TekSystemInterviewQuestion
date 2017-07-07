package com.tek.interview.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tek.interview.bean.Item;
import com.tek.interview.calculate.PriceCalculator;

public class CalculateTaxTest {

	@Test
	public void test() {
		double expectedTax = 7.12;
		double calculatedTax = PriceCalculator.calculateTax(new Item("imported item", (float) 47.50), 1);
		assertEquals(expectedTax, calculatedTax, Double.MIN_VALUE);
	}

}
