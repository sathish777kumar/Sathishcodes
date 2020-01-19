package Program;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.Travelplacepage;
import Baseclass.Baseclass;
import static Object.Objectclass.*;
import static Configuration.configurationclass.*;
import static UIWrapper.Wrapperclass.*;
import static Generalmethods.generalmethod.*;


public class Program extends Baseclass{
	
	LoginPage test;
	Travelplacepage test1;
	
	
	
@Test
	
	public  void wet () throws Exception {
				
		URLs(URL);
		win();
		clik(cwwindowclick);
		Thread.sleep(3000);
		
		//Login page
		test = new LoginPage(obj);
		test.enterUsername();
		test.enterPassword();
		test.clickSubmit();
		
		
		Thread.sleep(3000);
		
		//Travel place page
		test1 = new Travelplacepage(obj);
		test1.enterstartplace();
		Thread.sleep(3000);
		test1.selectstartplace();
		Thread.sleep(3000);
		test1.enterendplace();
		Thread.sleep(3000);
		test1.selectendplace();
		test1.calendr();
		test1.selectdate();
		test1.clearoldvalue();	
		test1.noofpass();
		test1.clicksearch();
		
		
		clik(Book);
		Thread.sleep(2000);
		enterdata(p1age, pass1age);
		Thread.sleep(2000);
		enterdata(p2name, pass2name);
		enterdata(p2age,pass2age);
		enterdata(p3name, pass3name);
		enterdata(p3age, pass3age);
		det();	
		tan();
		enterdata(mobile, mobilenumber);
		clik(submit);
		Thread.sleep(5000);
		ops();
		Thread.sleep(2000);clik(makepay);
	}
}
