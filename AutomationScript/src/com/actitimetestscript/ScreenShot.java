package com.actitimetestscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void screenShot () throws IOException, InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new  File("./screenshot/ss.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/");
		TakesScreenshot ta=(TakesScreenshot) driver;
		File src1=ta.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshot/ss1.png");
		FileUtils.copyFile(src1, des);
		driver.close();	
	}
}