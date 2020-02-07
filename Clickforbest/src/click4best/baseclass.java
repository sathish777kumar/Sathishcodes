package webpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;

public class baseclass {
	
	WebDriver d;
	
	@BeforeClass
	public void setUp()
	{
		d=new FirefoxDriver();
			/*System.setProperty("webdriver.ie.driver", "F:\\Selenium_Scripts_April13\\Lib\\IEDriverServer.exe");
			d=new InternetExplorerDriver();*/
		/*	System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Scripts_April13\\Lib\\chromedriver.exe");
			d=new ChromeDriver();*/
	}
	//@AfterMethod
	public void tearDown()
	{
		d.quit();
	}


}
