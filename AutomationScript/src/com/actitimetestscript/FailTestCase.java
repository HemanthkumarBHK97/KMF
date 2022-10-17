package com.actitimetestscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailTestCase {
	@Test
	private void methodONE() {
		Reporter.log("Frist Method");
	}
	@Test
	private void methodTwo() {
		Assert.fail();
		Reporter.log("Second Method");
	}
}
