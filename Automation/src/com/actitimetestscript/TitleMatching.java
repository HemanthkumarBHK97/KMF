package com.actitimetestscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;



public class TitleMatching {
	/*static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	private void titleVerify() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle = "Google";
		String aTitle = driver.getTitle();
		if(aTitle.equals(eTitle)) {
			Reporter.log("Title is matching with Google",true);
		}
		else {
			Reporter.log("Title is NOT matching with Google",true);
		}
	}*/
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public void instaTitle() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String eTitle = "Pasta";
		String aTitle = driver.getTitle();
		if(eTitle.equals(aTitle)) {
			Reporter.log("The TITLE is Matching",true);
		}
		else {
			Reporter.log("The TITLE is NOT Matching",true);
		}
	}
}


