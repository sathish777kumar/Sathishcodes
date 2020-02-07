package practice.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	WebDriver desk;
	
    @Test
    public void baseclass1()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Desktop\\chromedriver.exe");
    	
    	desk = new ChromeDriver();
    	
    }
}
