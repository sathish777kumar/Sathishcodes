package webpack;

import static org.testng.AssertJUnit.assertEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
//import java.net.URL;



import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.apache.commons.io.FileUtils;
import org.testng.Reporter;
import org.testng.annotations.*;



public class ScreenshotsDemo {
	WebDriver d;
	@BeforeSuite
	public void text() throws Exception {
		d = new FirefoxDriver();
	}
	
    @Test
    public void myTest() throws Exception {
        try{
        	 d.get("http://www.google.com");
        	 
        d.findElement(By.name("jghkjgkjq")).isDisplayed();
       
        }
        catch(Exception e){
        	
        
        
       	 File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        
       	 FileUtils.copyFile(scrFile, new File("D:\\screenshots\\webscreen8.png"));
       	 
       	 /*
            Reporter.log("<img src=\"file:///D:/screenshots/webscreen8.png"+"\" alt=\"\"/><br />");
            Reporter.log("<a href='"+"file:///D:" +"/screenshots/" + "webscreen8" + ".jpg'/> </a>");
*/
            
            
            
            d.findElement(By.name("jghkjgkjq")).isDisplayed();
        
        }
             
         //    assertEquals("as","asdw");
             
        
        
        	
        
            
        // then Augmenter will add the TakesScreenshot methods to the instance
        
       
        
        
    }
    @AfterMethod
    public void stop()
    {
    	d.quit();
    }
}