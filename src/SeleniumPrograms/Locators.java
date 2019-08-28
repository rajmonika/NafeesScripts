package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
			
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		/*//Identifying the first name box
		driver.findElement(By.id("u_0_l")).click();		
		driver.findElement(By.id("u_0_l")).sendKeys("monika");
		Thread.sleep(2000);
		
		//Identifying the last name box
		WebElement LN = driver.findElement(By.name("lastname"));
		LN.click();
		LN.sendKeys("1234");
		Thread.sleep(2000);
		
		//Identifying the link
		//WebElement createPage = driver.findElement(By.linkText("Create a Page"));
		//createPage.click();
		
		//Identifying all links consisting keyword Page
		List<WebElement> Pages = driver.findElements(By.partialLinkText("Page"));
		for(WebElement P:Pages)
		{
			System.out.println(P.getText());
		}
		
		//Identifying all links on page using <a> tag
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement l : links)
		{
			System.out.println(l.getText());
		}*/
		
		//Identifying all links on page using <input> tag
				/*List<WebElement> box = driver.findElements(By.tagName("input"));
				for(WebElement b : box)
				{
					System.out.println(b.getAttribute("name"));
				}*/
				
		
		//Identifying using CSS selector
		driver.findElement(By.cssSelector("[class='inputtext'][type='email']")).sendKeys("abc@def.com");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[value='Log In'][type='submit']")).click();
		

	}

}
