package webpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MultiWindowDemo {
WebDriver d;

@BeforeSuite
public void text() throws Exception {
	d = new FirefoxDriver();
}


@Test
public void multiWindow() throws InterruptedException
{
	d.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=http://mail.google.com/mail/&scc=1&ltmpl=default&ltmplcache=2");
	
	String pcode=d.getWindowHandle();
	
	
	
	System.out.println("Parent code is:"+pcode);
	
	
	d.findElement(By.linkText("Help")).click();
	
	Thread.sleep(4000);
	
	for(String ccode:d.getWindowHandles())
	{
		
		if (ccode!=pcode) {
		String childWindow = ccode;
		
		d.switchTo().window(childWindow);
		}
	}
	
	assertEquals("Accounts Help", d.getTitle());
	
	d.close();
	
	d.switchTo().window(pcode);
	
	//assertEquals("Gmail: Email from Google", d.getTitle());
	
	d.findElement(By.name("Email")).isDisplayed();
	
	Thread.sleep(4000);
	
}
		@AfterMethod
	public void tearDown()
	{
		d.close();
	}

}
