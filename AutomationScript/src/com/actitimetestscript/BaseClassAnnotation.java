package com.actitimetestscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClassAnnotation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	WebDriver driver;
	@BeforeTest
	public void openBrowser()  {
		Reporter.log("openBrowser",true);
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Reporter.log("closeBrowser",true);
		Thread.sleep(2000);
		driver.close();
	}
	@BeforeMethod
	public void logIN() throws InterruptedException  {
		Reporter.log("logIN",true); 
		Thread.sleep(2000);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	@AfterMethod
	public void logOut() throws InterruptedException {
		Reporter.log("logOut",true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'logout')]")).click();
	}
}