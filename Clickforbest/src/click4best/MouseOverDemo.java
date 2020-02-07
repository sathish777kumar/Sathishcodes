package webpack;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;


public class MouseOverDemo {
	WebDriver d;
	
	@BeforeMethod
	public void text() throws Exception {
		d = new FirefoxDriver();
	}
	
	@Test
	public void mouseOver() throws InterruptedException
	{
		d.get("http://ebay.in/");
		
		Actions ac=new Actions(d);
		
		
		WebElement e=d.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[1]/a"));
		
	
		ac.moveToElement(e,10,10).perform();
		
		
		Thread.sleep(6000);
		d.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/ul/li[1]/div/ul[2]/li[2]/a")).click();
		
		Thread.sleep(8000);
	
	}
		@AfterMethod
	public void tearDown()
	{
		d.quit();
	}


}
