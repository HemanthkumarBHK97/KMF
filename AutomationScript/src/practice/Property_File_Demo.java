package practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.FileLib;

public class Property_File_Demo {

	public static void main(String[] args) throws Throwable {
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver =new ChromeDriver();
	  FileInputStream file=new FileInputStream("./Data/Actitime_Login.property");
		Properties pro=new Properties();
		pro.load(file);
		String link = pro.getProperty("URL");
		String un = pro.getProperty("Username");
		String pws = pro.getProperty("Password");
		driver.get(link);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pws);
		driver.get(FileLib.getPropertyValue("URL"));
	    System.out.println(FileLib.getPropertyValue("URL"));	
	}
}
