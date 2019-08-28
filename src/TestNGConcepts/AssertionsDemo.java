package TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionsDemo {
	
WebDriver driver;
	
	@BeforeMethod
  public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
  }
  
  @Test
  public void TitleTest() {
	  
	  String title = driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title, "Google");
  }
  
  @Test
  public void Logo()
  {
	  boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
	  Assert.assertTrue(b, "Logo is Present");
  }
  

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
	  
  }
  


}
