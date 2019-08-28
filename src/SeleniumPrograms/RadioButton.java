package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
					driver.manage().deleteAllCookies();
					
					driver.get("http://demo.guru99.com/test/radio.html");
					
					driver.manage().window().maximize();
					
					WebElement r2 = driver.findElement(By.id("vfb-7-2"));
					r2.click();
					System.out.println("Second radio button is: "+r2.getAttribute("value"));
					if(r2.isDisplayed())
					{
						System.out.println("R2 is displayed");
					}
					
					Thread.sleep(3000);
					
					WebElement r3 = driver.findElement(By.id("vfb-7-3"));
					r3.click();
                    Thread.sleep(3000);
                    
                    if(r2.isSelected())
					{
						System.out.println("R2 is selected");
					}
                    else
                    	System.out.println("R2 is NOT selected");
					
                    if(r3.isSelected())
					{
						System.out.println("R3 is selected");
					}
					
                    //isSelected, isDisplayed, isEnabled
                    
                    if(r3.isEnabled())
                    {
                    	System.out.println("R3 is enabled");
                    }
                    
                    List<WebElement> rb = driver.findElements(By.xpath("//input[@type='radio']"));
                    
                    for(WebElement r:rb)
                    {
                    	System.out.println("Radio name: "+r.getAttribute("value"));
                    }
                    


	}

}
