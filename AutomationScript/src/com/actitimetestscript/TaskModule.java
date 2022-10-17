package com.actitimetestscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule  extends BaseClassAnnotation{
	@Test
	public void createTask() {
		Reporter.log("createTask");
	}
	@Test
	public void modifyTask() {
		Reporter.log("modifyTask");
	}
	@Test
	public void deleteTask() {
		Reporter.log("deleteTask");
	}
}
