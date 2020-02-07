   package webpack;
   import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.firefox.FirefoxProfile;  
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;  
import org.openqa.selenium.interactions.Actions;  
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;  
      
    public class DragNDropDemo {  
       
     WebDriver driver;  
       
     @BeforeTest
 	public void text() throws Exception {
 		driver = new FirefoxDriver(); 		
 	}
      
     @Test  
     public void start1() throws InterruptedException{  
      driver.get("http://jqueryui.com/demos/");
      //driver.manage().timeouts().implicitlyWait(180,TimeUnit.SECONDS);
      
      driver.findElement(By.linkText("Draggable")).click();
      driver.findElement(By.linkText("Droppable")).click();
      
      
      
      driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
      
      
      WebElement dragElement=driver.findElement(By.id("draggable"));  
      WebElement dropElement=driver.findElement(By.id("droppable"));  
      
    
      
      Actions builder = new Actions(driver);
      
      builder.dragAndDrop(dragElement, dropElement).perform();
      
    /* Actions builder = new Actions(driver);  // Configure the Action  
      Action dragAndDrop = builder.clickAndHold(dragElement)  
        .moveToElement(dropElement)  
        .release(dropElement)  
        .build();  // Get the action  
        dragAndDrop.perform(); // Execute the Action  
*/   
      
      //builder.clickAndHold(dragElement).moveToElement(dropElement).moveByOffset(20, 20).click().perform();
      Thread.sleep(8000);
      
      driver.switchTo().defaultContent();
     }  
     @AfterTest
     public void stop()
     {
    	 driver.quit();
     }
    }  