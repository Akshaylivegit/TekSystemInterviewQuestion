package com.tek.interview.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddOrderTest.class, CalculateTaxTest.class, RoundingValueTest.class })
public class AllTests {

}
