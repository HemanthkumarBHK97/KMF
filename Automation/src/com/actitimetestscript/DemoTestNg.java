package com.actitimetestscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNg {

	@Test(dependsOnMethods = {"createmodule"})
	public void customerModule() {
		Reporter.log("customerModule");
	}
	@Test//(dependsOnMethods = "createmodule")
	public void createmodule() {
		Reporter.log("createmodule");
	}
	@Test
	public void modifycustomer() {
		Reporter.log("modifycustomer");
	}
 
}
