package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'HEG Ltd.')]")).getText());
		
		int hegRow = driver.findElements(By.xpath("//a[contains(text(),'HEG Ltd.')]/parent::*/parent::*")).size();
        System.out.println("HEG Row count: "+hegRow);
        
        int hegCols = driver.findElements(By.xpath("//a[contains(text(),'HEG Ltd.')]/parent::*/parent::*/td")).size();
        System.out.println("HEG Col Count: "+hegCols);
        
        int totRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
        System.out.println("Total rows in the table: "+totRows);
        
        List<WebElement> CompanyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
        for(WebElement company : CompanyNames)
        {
        	System.out.println(company.getText());
        }
        
        ////table[@class='dataTable']/tbody/tr[i]/td[4]
       /* String firstpart = "//table[@class='dataTable']/tbody/tr[";
        String secondpart = "]/td[4]";
        
        for(int i=1; i<totRows; i++)
        {
        	String finalpart = firstpart + i + secondpart;
        	List<WebElement> currentPrice = driver.findElements(By.xpath(finalpart));
        	
        	for(WebElement cp : currentPrice)
        	{
        		System.out.print(cp.getText());
        	}
        	
        }*/
        
      //table[@class='dataTable']/tbody/tr[i]/td[j]
        String firstpart = "//table[@class='dataTable']/tbody/tr[";
        String secondpart = "]/td[";
        String thirdpart = "]";
        
        for(int i=1; i<totRows; i++)
        {
        	for(int j=1; j<hegCols; j++)
        	{
        	String finalpart = firstpart + i + secondpart + j +thirdpart;
        	String companyData = driver.findElement(By.xpath(finalpart)).getText();
        	System.out.print(companyData+ "|");
        }
        	System.out.println();
        
        
       	}

	}}
