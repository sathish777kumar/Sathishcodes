package new1.new1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class Baseclass 
{
	@BeforeMethod
	
	public void baseclass() throws Exception {
		
		System.out.println("Execute");
	}
	
@AfterMethod
	
	public void baseclass1() throws Exception {
		
		System.out.println("Terminate");
	}
	
	
}
