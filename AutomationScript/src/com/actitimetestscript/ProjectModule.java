package com.actitimetestscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule  extends BaseClassAnnotation{
	@Test
	public void createProject() {
		Reporter.log("createProject");
	}
	@Test
	public void modifyProject() {
		Reporter.log("modifyProject");
	}
	@Test
	public void deleteProject() {
		Reporter.log("deleteProject");
	}
}
