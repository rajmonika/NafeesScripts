package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Information Alert Box
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept(); //OK
		Thread.sleep(2000);
		
		//Confirmation Alert Box
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss(); //Cancel
		Thread.sleep(2000);
		
		driver.close();

	}

}
