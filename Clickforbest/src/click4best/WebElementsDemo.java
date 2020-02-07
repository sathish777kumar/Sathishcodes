package webpack;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class WebElementsDemo {
	WebDriver d;

	@Test
	public void testWebElements() throws InterruptedException
	{
		d.get("http://book.theautomatedtester.co.uk/");
		d.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		assertEquals("Selenium: Beginners Guide", d.getTitle());
		d.findElement(By.linkText("Chapter1")).click();
		WebElement radio=d.findElement(By.id("radiobutton"));
		if(radio.isSelected())
		{
			System.out.println("Radio button is already selected");
		}
		else
		{
			radio.click();
		}
		
		
		
		Select s=new Select(d.findElement(By.id("selecttype")));
		s.selectByIndex(3);
		
		
		
		
		WebElement checkbox=d.findElement(By.name("selected(1234)"));
		if(checkbox.isSelected())
		{
			System.out.println("Check box is already selected");
		}
		else
		{
			checkbox.click();
		}
		d.findElement(By.id("html5div")).clear();
		d.findElement(By.id("html5div")).sendKeys("Selenium");
		Thread.sleep(6000);
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
