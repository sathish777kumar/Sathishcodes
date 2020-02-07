package TestNGBeforeAfter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	@BeforeTest
	
	public static void man () throws Exception {
		
		System.out.println("Introduction");
		
			}
	
	@AfterTest
	
	public static void women () throws Exception {
		
		System.out.println("Thank you");
	}

}
