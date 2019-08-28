package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-6-0")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-6-1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-6-2")).click();
		Thread.sleep(2000);

		List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement b:boxes)
		{
			System.out.println("Checkbox name: "+b.getAttribute("value"));
		}

	}

}
