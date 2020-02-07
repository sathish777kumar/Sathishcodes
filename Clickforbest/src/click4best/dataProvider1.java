package webpack;


import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class dataProvider1 {
public WebDriver driver;
public String baseurl="http://newtours.demoaut.com";
	
@BeforeTest
public void init()
{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(baseurl);
}





@DataProvider(name="Muthu")
public Object[][] param()
{
	Object[][] testdata=new Object[2][2];
	
	testdata[0][0]="mercury";
	testdata[0][1]="selenium";
	
	testdata[1][0]="test";
	testdata[1][1]="testa";
	
	return testdata;
}




@Test(dataProvider="Muthu")
public void actualtest(String name, String password)
{
	WebElement names=driver.findElement(By.name("userName"));
	WebElement passs=driver.findElement(By.name("password"));
	names.sendKeys(name);
	passs.sendKeys(password);
	driver.findElement(By.name("login")).click();
	/*WebDriverWait wt=new WebDriverWait(driver,30);
	wt.until(ExpectedConditions.titleContains("Find a Flight: Mercury Tours:"));
	driver.findElement(By.linkText("SIGN-OFF")).click();
	WebDriverWait wt1=new WebDriverWait(driver,30);
	wt1.until(ExpectedConditions.titleContains("Sign-on: Mercury Tours"));
*/
driver.get(baseurl);	
}

@AfterTest
public void tear()
{
	driver.quit();
}

}
