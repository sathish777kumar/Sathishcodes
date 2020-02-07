package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public static WebDriver obj;
	
	public static void best() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Downloads\\chromedriver.exe");
	
	 obj = new ChromeDriver();
	
	obj.manage().window().maximize();

	}
}
