package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property_File {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {	
		FileInputStream fils = new FileInputStream("./Files/Common_Data.property");
		Properties pro = new Properties();
		pro.load(fils);
		String url = pro.getProperty("url");
		String un = pro.getProperty("un");
		String pws = pro.getProperty("pws");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		System.out.println(url);
		driver.findElement(By.name("username")).sendKeys(un);
		System.out.println(un);
		driver.findElement(By.name("pwd")).sendKeys(pws);
		System.out.println(pws);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}
}
