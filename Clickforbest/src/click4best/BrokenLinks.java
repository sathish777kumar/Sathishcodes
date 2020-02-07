package webpack;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BrokenLinks {
	WebDriver d;
	
	@Test
	public void webLinks()throws Exception
	{
		//open brother.co.uk
		d.navigate().to("http://www.whitecase.com/");
		//wait for 30 seconds
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		d.manage().window().maximize();
		
		
		
		
		int k;
		
		for (k=1;k<4;k++){
			
			 d.findElement(By.xpath("//ul/li["+k+"]/a/img")).click();
			 d.getTitle();
			 
			 
			 
			 if (d.getTitle().contains("404 Error"))
			 {
				 System.out.println("Link:Not Working. Some issue Exists");
				 d.navigate().back();

			 }
			 
			 
			 else if (d.getTitle().contains("500 Error")) 	
			 
			 {

				 System.out.println(" Link:Not Working. Some issue Exists");
				 
				 d.navigate().back();
				 d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 }
			 
			 else{
				System.out.println(" Link: Working."); 
				d.navigate().back();
				d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 }


			
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