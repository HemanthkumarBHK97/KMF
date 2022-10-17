package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property_Flipkart_Login {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fils =new FileInputStream("./data/Flipkart_Login.property");
		Properties pp =new Properties();
		pp.load(fils);
		String link = pp.getProperty("url");
		System.out.println(link);
		String mobile = pp.getProperty("mob");
		System.out.println(mobile);
		String password = pp.getProperty("pws");
		System.out.println(password);
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(link);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).sendKeys(mobile);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- _3mctLh VJZDxU')]")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/button/div[1]/../span")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);
		driver.close();
		
	}
}
