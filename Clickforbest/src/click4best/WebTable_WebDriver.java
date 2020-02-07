package webpack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebTable_WebDriver {
	WebDriver d;

	@BeforeSuite
	public void text() throws Exception {
		d = new FirefoxDriver();
	}
	
	
	@Test
	public void dynamicTable()throws Exception
	{
		
		d.get(" http://www.aponline.gov.in/apportal/index.asp");
		d.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
		
		d.findElement(By.linkText("Key Contacts")).click();
		
		d.findElement(By.linkText("District Officials")).click();
		
		Select s=new Select(d.findElement(By.id("Select1")));
		s.selectByIndex(7);
		//s.selectByValue("Hyderabad");
		
		
		WebElement we=d.findElement(By.id("Table4"));
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
	@AfterMethod
	public void stop()
	{
		d.quit();
	}
	

}
