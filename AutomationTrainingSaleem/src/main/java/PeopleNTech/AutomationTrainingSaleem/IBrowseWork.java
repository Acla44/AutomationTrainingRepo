package PeopleNTech.AutomationTrainingSaleem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IBrowseWork 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eRisheXpress\\Documents\\PnT Files\\Selenium\\AutomationTrainingSaleem\\src\\main\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(3000);
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    String windowhandle = driver.getWindowHandle();
	    System.out.println(windowhandle);
	    String urlofbrowser = driver.getCurrentUrl();
	    System.out.println(urlofbrowser);
	    driver.close();
	 
	    		
		/////////////////////////

	}

}
