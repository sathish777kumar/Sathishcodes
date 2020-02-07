package rest.rest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class class1 extends baseclass
{
	
    
    @Test
    public void testcase111()
    {
    	
    	
    	
    	driver.get("https://www.google.com");
    	driver.findElement(By.name("q")).sendKeys("practice it");
            }



@Test
public void testcase121()
{
	
	
	
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("Standard chartered");
        }


@Test
public void testcase1123()
{
	
	
	
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("Citi bank");
        }
}
