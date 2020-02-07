package webpack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class AlertsDemo {
	WebDriver d;
	
	@BeforeTest 
	public void text() throws Exception {
		d = new FirefoxDriver();
	}
	
	@Test
	public void webAlerts() throws InterruptedException
	{
		d.get("http://www.bizbilla.com/svasam-agriculture-consultancy/products/p_1438?Ready-made-suits");
		
		//click submit button, without entering username and password
	
		d.findElement(By.xpath("/html/body/section/div/section/section/section/div/div/section/div[3]/div[1]/div[2]/div[6]/div/a")).click();
		
		Thread.sleep(5000);
		d.findElement(By.xpath("/html/body/div[3]/div/form/table/tbody/tr[8]/td/input")).click();
		
		Thread.sleep(5000);
		Alert sesha = d.switchTo().alert();
		System.out.println(sesha.getText());
		
		
		sesha.accept();
		Thread.sleep(5000);
		}
	
	//@Test(groups = {"high"})
	public void webAlerats() throws InterruptedException
	{
		d.get("http://ask.com");
		Thread.sleep(4000);
	d.findElement(By.xpath("/html/body/div/div/div/nav/ul[3]/li[2]/div/a")).click();
	Thread.sleep(8000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[3]/div[2]/form/div/div[4]/div[3]/a/span")).click();
		Thread.sleep(4000);
		String a = d.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[3]/div[2]/form/div/div/span")).getText();
		System.out.println(a);
		
		assertEquals("Please complete all fields",a);
	
		
		
		
		}
			public void webAlerts(String s) throws Exception {
				
			}
	
	@AfterTest
	public void tearDown()
	{
		d.quit();
	}

}
