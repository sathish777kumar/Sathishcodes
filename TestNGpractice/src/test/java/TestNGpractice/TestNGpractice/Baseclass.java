package TestNGpractice.TestNGpractice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * Unit test for simple App.
 */

		
public class Baseclass 
{
	
	@BeforeClass
   public static void start () throws Exception {
	   
	   System.out.println("Start");
   }
   
   @AfterClass
   public static void end () throws Exception {
	   
	   System.out.println("End");
   }
}
