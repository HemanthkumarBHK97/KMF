package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\SURYA PRAKASH B\\Downloads\\HomePage.html");
		WebElement link = driver.findElement(By.tagName("a"));
		link.click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.id("id1")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.name("ni")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.className("c1")).click();
		driver.close();
	}
}
