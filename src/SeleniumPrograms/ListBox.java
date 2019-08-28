package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement listbox = driver.findElement(By.xpath("//select[@class='form-control pickListSelect pickData']"));
		
		Select sel = new Select(listbox);
		sel.selectByIndex(1);
		Thread.sleep(3000);
		
		sel.selectByVisibleText("Laura");
		Thread.sleep(3000);
		
		
		sel.deselectByVisibleText("Sophia");
		Thread.sleep(3000);
		
		//sel.selectByValue("4"); //------check-----not working
		//Thread.sleep(3000);
		

	}

}
