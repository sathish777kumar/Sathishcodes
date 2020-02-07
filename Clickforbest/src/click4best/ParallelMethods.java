package webpack;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ParallelMethods {
	
	@Test
	public void testSync()
	{
		
		WebDriver d = new FirefoxDriver();
		
		d.get("https://www.google.co.in/");
		d.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
		assertEquals("Google",d.getTitle());
		d.findElement(By.id("gbqfq")).sendKeys("Selenium");
		d.findElement(By.id("gbqfb")).click();
	    /*WebDriverWait wait=new WebDriverWait(d,180);
	    WebElement e=d.findElement(By.linkText("Selenium - Web Browser Automation"));
	     wait.until(ExpectedConditions.elementToBeSelected(e));
	    e.click();*/
	    d.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		d.findElement(By.linkText("Download")).click();
		assertTrue(d.findElement(By.xpath("//div[@id='mainContent']/h3")).getText().contains("Selenium IDE"));
		
	}

	@Test
	public void dynamicTable()throws Exception
	{
	WebDriver sd = new FirefoxDriver();
		sd.get("http://www.aponline.gov.in/apportal/index.asp");
		sd.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
		sd.findElement(By.linkText("Key Contacts")).click();
		sd.findElement(By.linkText("District Officials")).click();
		Select s=new Select(sd.findElement(By.id("Select1")));
		s.selectByIndex(7);
		//s.selectByValue("Hyderabad");
		WebElement we=sd.findElement(By.id("Table4"));
		//List<WebElement> tr_collection=we.findElement(By.xpath("id('testTable')/tbody/tr"));
		List<WebElement> tr_collection=we.findElements(By.xpath("id('Table4')/tbody/tr"));
		System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
		List<WebElement> td_collection1=we.findElements(By.xpath("id('Table4')/tbody/tr/td"));
		System.out.println("NUMBER OF Columns IN THIS TABLE = "+td_collection1.size()/tr_collection.size());
		
		int row_num,col_num;
        row_num=1;
        for(WebElement trElement : tr_collection)
        {
            List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
            //System.out.println("NUMBER OF COLUMNS="+td_collection.size());
            col_num=1;
            for(WebElement tdElement : td_collection)
            {
                System.out.println("row # "+row_num+", col # "+col_num  + ", text=" +tdElement.getText());
                col_num++;
            }
            row_num++;
        }
      
        }
	
	@Test
    public void testScreenshots() throws Exception {
        WebDriver ds = new FirefoxDriver();
       
        ds.get("http://www.google.com");
        ds.findElement(By.name("q")).sendKeys("Selenium");
             
        // then Augmenter will add the TakesScreenshot methods to the instance
        File scrFile = ((TakesScreenshot)ds).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("F:\\Selenium_Scripts_April13\\Results\\Screenshots\\webscreen1.png"));
        
        
    }
}
