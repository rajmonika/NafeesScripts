package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test_user101");
		Thread.sleep(2000);
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.linkText("Privacy Policy")).click();
		
		

	}

}
