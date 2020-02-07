package webpack;
import static org.testng.AssertJUnit.assertEquals;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.interactions.Actions;  
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;  
      
    public class allComands {  
       
    	 WebDriver driver;
       
     @BeforeSuite
 	public void text() throws Exception {
    	 driver = new FirefoxDriver();
 	}
      
     @Test  
     public void start1() throws InterruptedException{
    	 
    	 
 
    	 //open an url
    	 driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
    	 driver.navigate().to("");
    	 
    	 
    	 //clicking
    	 
    	 driver.findElement(By.cssSelector("submitButton")).click();

    	 //get text
    	 String iihg = driver.findElement(By.tagName("select")).getText();
    	 String expec = "invalid username and password";
    	 
    	 
    	 
    	 assertEquals(iihg,expec);
    	 

    	 
    	 
    	 //type
    	 driver.findElement(By.name("fname")).sendKeys("My First Name");
    	 
    	 driver.findElement(By.name("fname")).clear();
    	 
    	 
    	 
    	 //implicit
    	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	  driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
    	 
    	  
    	 //explicit  	  
    	  WebDriverWait wait = new WebDriverWait(driver, 15);    	 
    	 wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='timeLeft']"), "Time left: 7 seconds"));
    	 
    	 //get title
    	String f =  driver.getTitle();
    	
    	assertEquals(f,"google-homepage");
    	 
    	 //get url
    	 driver.getCurrentUrl();
    	 
    	 //generating alert
    	 JavascriptExecutor javasacript = (JavascriptExecutor) driver;
    	 javasacript.executeScript("alert('Test Case Execution Is started Now..');");
    	 
    	 
    	 //select / deselect / multiple select
    	 Select mydrpdwn = new Select(driver.findElement(By.id("Carlist")));
    	 mydrpdwn.selectByVisibleText("Armed Forces Service Medal Veterans");
    	 mydrpdwn.selectByIndex(1);
    	 mydrpdwn.selectByValue("R50905");
    	 
    	 
    	 boolean a = driver.findElement(By.id("")).isSelected();
    	 
    	 if(a==true){
    		 System.out.println("");
    	 }
    	 else{
    		 driver.findElement(By.id("")).click();
    	 }
    	 
    	 
    	 
    	 //browser leevel
    	 driver.navigate().back();
    	 driver.navigate().forward();
    	 
    	 
    	 //element present
    	 Boolean iselementpresent = driver.findElements(By.xpath("//input[@id='text2']")).size()!= 0;
    	 
    	 driver.findElements(By.xpath("")).isEmpty();
    	 
    	 /*//window handling
    	 
    	 //click on the link 
    	 
    	 Set<String> AllWindowHandles = driver.getWindowHandles();
    	 
    	 String window1 = (String) AllWindowHandles.toArray()[0];
    	 String window2 = (String) AllWindowHandles.toArray()[1];
    	 driver.switchTo().window(window2);
    	 */
    	 //enable or disable
    	 boolean fname = driver.findElement(By.xpath("//input[@name='fname']")).isDisplayed();
    	 System.out.print(fname);
    	 
    	 driver.findElement(By.xpath("")).isEnabled();
    	 
    	 //making enable or disable
    	 JavascriptExecutor jaavascript = (JavascriptExecutor) driver;
    	 String todisable = "document.getElementsByName('fname')[0].setAttribute('disabled', '');";
    	 jaavascript.executeScript(todisable);
    	 String toenable = "document.getElementsByName('lname')[0].removeAttribute('disabled');";
    	 jaavascript.executeScript(toenable);
    	 
    	//submit
    	 
    	 driver.findElement(By.xpath("//input[@name='Company']")).submit();
    	 
    	 
    	 
    	 
    	 //multiple key press
    	 WebElement someElement = driver.findElement(By.xpath(""));
    	 WebElement someOtherElement = driver.findElement(By.xpath(""));
    	 
    	 
    	 
    	 Actions builder = new Actions(driver);
    	 
    	    	 builder.keyDown(Keys.CONTROL).click(someElement).click(someOtherElement).keyUp(Keys.CONTROL).build().perform();
    	    	 
    	    	 builder.keyDown(Keys.ALT).keyDown(Keys.F4).build().perform();
    	    	 
    	 
    	  
    	    	 
    	//deleting all cookies
    	    	 driver.manage().deleteAllCookies();
    	    	 
    	    	 
    	    	 
    	    	 //refresh
    	    	 driver.navigate().refresh();
    	    	 
    	    	 
    	 
    	 
    	 
     }
    }  