package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
			
		driver.get("https://www.amazon.in");
		
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
			
		driver.navigate().to("https://www.ebay.com/");
		String title1 = driver.getTitle();
		System.out.println("Title of the page is: "+title1);
		
		System.out.println("Current URL: "+driver.getCurrentUrl());
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Current URL: "+driver.getCurrentUrl());
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		//System.out.println(driver.getPageSource());
		
		driver.close(); //closing only the current tab
		
		//driver.quit();  //closes the entire browser

	}

}
