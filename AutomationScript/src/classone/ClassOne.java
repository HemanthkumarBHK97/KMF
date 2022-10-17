package classone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class ClassOne {
	static {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver1 =new EdgeDriver();
		/*driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> lists = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		Thread.sleep(2000);
		int count = lists.size();
		System.out.println("Total suggestion count is  "+count);
		for(int i=0;i<count;i++ ) {
			String text = lists.get(i).getText();
			System.out.println(text);
		}
		driver.close(); */
	}
}


