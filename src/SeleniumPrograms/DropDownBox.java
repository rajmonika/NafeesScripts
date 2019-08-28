package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBox {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));

		Select sel = new Select(dropdown);
		
		//selectbyIndex, selectByValue, SelectByVisibileText
		
		WebElement firstOption = sel.getFirstSelectedOption();
		System.out.println("Default selected value of the Drop down: "+firstOption.getText());
		
		
		sel.selectByIndex(5);
		Thread.sleep(3000);
		
		sel.selectByVisibleText("Crafts");
		Thread.sleep(3000);
		
		sel.selectByValue("1249"); //Video Games & Consoles
				
		List<WebElement> options = sel.getOptions();
		
		System.out.println("All the items in the drop down list are:");
		for(WebElement item : options)
		{
			System.out.println(item.getText());
		}
		
		Thread.sleep(4000);
		driver.close();
		
		

	}

}
