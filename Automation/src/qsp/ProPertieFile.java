package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProPertieFile {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		FileInputStream file= new FileInputStream("./Files/commondata.property");
		Properties pro =new Properties();
		pro.load(file);
		String un = pro.getProperty("name");
		driver.findElement(By.id("username")).sendKeys(un);
		
		

		
		
	}
}
