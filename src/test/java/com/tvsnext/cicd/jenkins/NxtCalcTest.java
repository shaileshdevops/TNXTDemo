package com.tvsnext.cicd.jenkins;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class NxtCalcTest {

	@Test
	public void addTest() {
		NxtCalculator calc = new NxtCalculator();
		AssertJUnit.assertEquals(10, calc.addNumbers(5, 5));
	}
	
	@Test
	public void subtractTest() {
		NxtCalculator calc = new NxtCalculator();
		AssertJUnit.assertEquals(10, calc.subtractNumbers(15, 5));
	}

}
