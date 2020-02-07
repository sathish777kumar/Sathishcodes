package rest.rest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class baseclass {
	
WebDriver driver;
	
	
	@BeforeSuite
	public void baseclass1()
	
	
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Desktop\\chromedriver.exe");
    	
    	 driver = new ChromeDriver();
		
		
	}
	

}
