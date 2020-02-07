package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static Configuration.Configuration.*;
import static SETCobjects.Objects.*;
import static UIWrapper.UIwrapper.*;
import Basepackage.Baseclass;

public class class1SETCprogram extends Baseclass  {

@Test
	
	public static void bet () throws Exception {
		
			
		URLs(URL);
		
		enterdata(User,UName);
		enterdata(Pass, Password);
		signin(submit);
		
		Thread.sleep(3000);
		
		obj.findElement(By.id("matchStartPlace")).sendKeys("CHENNAI");
		
	Thread.sleep(3000);
		
		obj.findElement(By.xpath("//ul//li/a[text()='CHENNAI CMBT']")).click();
		
		Thread.sleep(3000);
		
		
		obj.findElement(By.id("matchEndPlace")).sendKeys("TIRUNELVELI");
		
		obj.findElement(By.xpath("//ul//li/a[text()='TIRUNELVELI']")).click();
		
		obj.findElement(By.className("cal")).click();
		
		obj.findElement(By.xpath("//div[1]/table/tbody/tr/td[text()='29']")).click();
		
		obj.findElement(By.name("txtAdultMales")).clear();
		
		obj.findElement(By.name("txtAdultMales")).sendKeys("3");
		
		obj.findElement(By.className("btnTxt")).click();
		
		obj.findElement(By.xpath("//tbody/tr[1]/td[2]/table/tbody[2]/tr[2]/td[10]/div/div/a[text()='Book']")).click();
		
		}

}