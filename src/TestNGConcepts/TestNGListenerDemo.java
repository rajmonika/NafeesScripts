package TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGConcepts.TestNGListeners.class)
public class TestNGListenerDemo {
	
	WebDriver driver;
	
	@Test
	public void test1()
	{
		System.out.println("test method 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test method 2");		
	}

	@Test
	public void test3()
	{
		System.out.println("test method 3");
	}

	@Test
	public void test4()
	{
		System.out.println("test method 4");
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
		String title = driver.getTitle();
		  System.out.println(title);
		  Assert.assertEquals(title, "Google123");
		  
	 
	}


}
