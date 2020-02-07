package webpack;




import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class WebDemo {
	WebDriver d;
	@BeforeMethod
	public void setUp()
	{
		d=new FirefoxDriver(); 
	}
	
	@Test(priority=1)
	public void testWebDemo() throws InterruptedException
	{
		d.get("https://www.google.co.in/");
		assertEquals("Google",d.getTitle());
		d.findElement(By.cssSelector("#gbqfq")).sendKeys("Selenium");
		Thread.sleep(5000);
		
		String f = "tes";
		assertEquals("sd",f);
	}
	
	
	@Test(priority=2)
	public void testWebDemko() throws InterruptedException
	{
		d.get("https://www.google.co.in/");
		assertEquals("Google",d.getTitle());
		d.findElement(By.cssSelector("#gbqfq")).sendKeys("Selenium");
		Thread.sleep(5000);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}

}
