package rest.rest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class class3 extends baseclass
{
	
	
    
    @Test
    public void testcase7()
    {
    	
    	
    	
    	driver.get("https://www.google.com");
    	driver.findElement(By.name("q")).sendKeys("SBI");
            }



@Test
public void testcase8()
{
	
	
	
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("Canara");
        }


@Test
public void testcase9()
{
	
	
	
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("Indian");
        }
}
