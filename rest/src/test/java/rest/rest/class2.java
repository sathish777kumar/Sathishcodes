package rest.rest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class class2 extends baseclass
{
	
	
    
    @Test
    public void testcase41()
    {
    	
    	
    	
    	driver.get("https://www.google.com");
    	driver.findElement(By.name("q")).sendKeys("HSBC");
            }



@Test
public void testcase51()
{
	
	
	
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("ICICI");
        }


@Test
public void testcase62()
{
	
	
	
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("HDFC bank");
        }
}
