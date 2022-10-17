package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		//WebDriver driver =new ChromeDriver();
	//	driver.get("https://www.google.co.in/");
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		FileInputStream fil=new FileInputStream("./data/login.property");
		Properties pro =new Properties();
		pro.load(fil);
		String url = pro.getProperty("url");
		System.out.println(url);
		String un = pro.getProperty("un");
		System.out.println(un);
		
	}
}
