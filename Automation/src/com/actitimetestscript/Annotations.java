package com.actitimetestscript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeMethod
public void logIN() {
	Reporter.log("logIN",true);
}
	@AfterMethod
	public void logOUT() {
		Reporter.log("logOUT",true);
	}
	@Test
	public void creatCustomer() {
		Reporter.log("creatCustomer",true);
	}
	@Test
	public void deleteCustomer(){
		Reporter.log("deleteCustomer",true);
	}
}
