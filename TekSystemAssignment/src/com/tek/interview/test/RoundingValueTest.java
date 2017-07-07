package com.tek.interview.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tek.interview.calculate.PriceCalculator;

public class RoundingValueTest {

	@Test
	public void test() {
		double value = 9.620000001;
		double roundUpValue = PriceCalculator.rounding(value);
		assertEquals(9.62, roundUpValue, Double.MIN_VALUE);
	}

}
