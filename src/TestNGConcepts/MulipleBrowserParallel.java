package TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MulipleBrowserParallel {
	
WebDriver driver;
	
    @Parameters("browserName")
	@BeforeMethod
  public void beforeMethod(String browserName) {
		
		
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		
  }
	else if (browserName.equalsIgnoreCase("Firefox"))
	{
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\geckodriver.exe");
		
		driver = new FirefoxDriver(); 
		driver.manage().window().maximize();

	}
	}
  
  @Test
  public void GoogleTitle() throws Exception {
	  
	  driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	  String title = driver.getTitle();
	  System.out.println(title);
	  Thread.sleep(3000);
  }
  

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
}
}
