package SeleniumPrograms;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String mainwindow = driver.getWindowHandle(); //ID of only the main window
		System.out.println("Widow ID of main window is: "+mainwindow);
		
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String win : windows)
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title+" ---- "+win);
			Thread.sleep(2000);
			if(title.equals("Amazon"))
			{
				driver.close();
			}
		}


	}

}
