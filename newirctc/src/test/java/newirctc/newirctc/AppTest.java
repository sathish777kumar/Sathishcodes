package newirctc.newirctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */


public class AppTest 
{

	@BeforeTest
	
    public static void case1 () throws Exception {
		
		System.out.println("result1");
    	    }
	
@Test
	
    public static void case2 () throws Exception {
		
		System.out.println("result2");
    	    }
}
