package PeopleNTech.AutomationTrainingSaleem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ILocators 
{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eRisheXpress\\Documents\\PnT Files\\Selenium\\AutomationTrainingSaleem\\src\\main\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    WebElement SearchIcon = driver.findElement(By.id("nav-search-submit-button"));
	    SearchIcon.click();
	    Thread.sleep(1000);
	    WebElement bestSellers = driver.findElement(By.linkText("Best Sellers"));
	    bestSellers.click();
	    Thread.sleep(1000);
	    WebElement Linktx = driver.findElement(By.partialLinkText("Epic"));
	    Linktx.click();
	    Thread.sleep(1000);
	    WebElement Searchfield = driver.findElement(By.name("field-keywords"));
	    Searchfield.sendKeys("Computer");
	    Thread.sleep(3000);
	    WebElement SearchIcon6 = driver.findElement(By.id("nav-search-submit-button"));
	    SearchIcon6.click();
	    
	    

	    
	    
	    

		
		
		
		
		
		//////////////////////////////////

	}

}
