package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classauto {
	
	public static void main (String args[])throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Downloads\\chromedriver.exe");
		
		WebDriver obj = new ChromeDriver();
		
		obj.manage().window().maximize();
		
		obj.get("https://www.tnstc.in/TNSTCOnline/");
		
	
		Thread.sleep(5000);
		
		obj.findElement(By.name("txtUserLoginID")).sendKeys("sathish777kumar");
		
		obj.findElement(By.name("txtPassword")).sendKeys("JESUSSATHISH");
		
		obj.findElement(By.xpath("//div/a[text()='Reset']")).click();
		
		
		
		
		
	}

}
