package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Baseclass {
	
		
	 public static WebDriver obj;
	 
	 @Test
	
	public static void let() throws Exception {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Downloads\\chromedriver.exe");
		
		 obj = new ChromeDriver();
		
		obj.manage().window().maximize();
			
	}

}
