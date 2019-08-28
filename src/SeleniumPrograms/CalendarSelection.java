package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarSelection {

	public static void main(String[] args) throws Exception {

/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); */
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 

		driver.manage().window().maximize();
		
		driver.get("https://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Hotel Selection
		
		driver.findElement(By.xpath("//div[@id='s2id_location']/a/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='s2id_location']/a/span")).sendKeys("mari");
		Thread.sleep(2000);
		
		List<WebElement> hotels = driver.findElements(By.xpath("//ul[@class='select2-result-sub']/li"));
		
		for(int i=0; i<hotels.size(); i++)
		{
			WebElement element = hotels.get(i);
			String text = hotels.get(i).getText();
			
			if(text.equals("Maribor, Slovenia"))
			{
				element.click();
				break;
			}
		}
		
		//Dates Selection
		
		String mon = "November 2019";
		
		driver.findElement(By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")).click();
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][4]/div[1]/table/thead/tr[1]/th[2]"));
		System.out.println(month.getText());
		
		
		while(true)
		{
			if(month.getText().equals(mon))
				break;
			else
			{
				driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][4]/div[1]/table/thead/tr[1]/th[3]")).click();
				Thread.sleep(2000);
			}
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][4]/div[1]/table/tbody/tr[4]/td[5]")).click();
		
		//Checkout Date
		
		/*String mon2 = "December 2019";
		String date2 = "5";*/
		
		//Count of Adult and Child Selection
		
		driver.findElement(By.id("htravellersInput")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='hadultPlusBtn']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='hchildPlusBtn']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("htravellersInput")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")).click();
	}

}
