package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("instagram");
		List<WebElement> autosugg = driver.findElements(By.xpath("//span[text()='instagram']"));
		Thread.sleep(2000);
		int count = autosugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = autosugg.get(i).getText();
			System.out.println(text);
		}
		
	
	}
}
