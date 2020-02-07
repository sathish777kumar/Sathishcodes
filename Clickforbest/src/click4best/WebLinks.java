
package webpack;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WebLinks {
	WebDriver d;
	
	@Test
	public void webLinks()throws Exception
	{
		d.navigate().to("https://www.google.co.in/");
		//d.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		assertEquals("Google",d.getTitle());
				
		
		
		//List<WebElement> alllinks=d.findElements(By.xpath("//div/ul/li/a[contains(@href,'http')]"));
		List<WebElement> alllinks=d.findElements(By.xpath("//font/a"));
		
		
		
		System.out.println("No of links :"+alllinks.size());
	
		
		
		
		for(int i=0;i<alllinks.size(); i++){
		d.findElement(By.xpath("//font/a["+i+"]")).click();
		
		 
		 //d.findElement(By.linkText("English")).click();
		 d.navigate().back();
		
		}
		
		
		
		
		String linkText[]=new String[alllinks.size()];
		
		
		int i=0;
	
		
		
		for(WebElement links : alllinks)
	        {
			     linkText[i]=links.getText();
			     System.out.println(linkText[i]);
			     i++;
	        }
		 for(String t:linkText)
		 {
			
				 d.findElement(By.linkText(t)).click();
				 
				 System.out.println(" "+t+" Link:Working fine");
				 //d.findElement(By.linkText("English")).click();
				 d.navigate().back();
			
		 }
		 
	}
	@BeforeSuite
	public void text() throws Exception {
		d = new FirefoxDriver();
	}
	
	@AfterSuite
	public void tearDown()
	{
		d.quit();
	}


}
