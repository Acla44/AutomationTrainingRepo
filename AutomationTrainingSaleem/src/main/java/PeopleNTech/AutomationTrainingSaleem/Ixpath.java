package PeopleNTech.AutomationTrainingSaleem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ixpath {
	public static WebDriver driver;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eRisheXpress\\Documents\\PnT Files\\Selenium\\AutomationTrainingSaleem\\src\\main\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    //Finding WebElement " username fields" by Absolute xpath.....
	    WebElement fields = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
	    fields.sendKeys("Erish");
	   
	    //Finding WebElement "pwd" by Absolute xpath....
	    WebElement pwd = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/div/input"));
	    pwd.sendKeys("sharma");
	   // WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/button"));
	    //loginBtn.click();
	    
	    //Finding WebElement loginButton by Relative xpath.....
	    WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
	    loginButton.click();
	    
	    
	    
		

	}

}
