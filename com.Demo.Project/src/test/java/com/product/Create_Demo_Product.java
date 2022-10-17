package com.product;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Demo_Product {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys("Apple_Mobile_SE2021");
		driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
		String title = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
		if(title.contains("Apple_Mobile_SE2021")) {
			System.out.println("Title is matched to  "+"Create_Demo_Product");
		}
		else {
			System.out.println("Title is NOT matched to "+"Create_Demo_Product");
		}
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.close();
	}
}
