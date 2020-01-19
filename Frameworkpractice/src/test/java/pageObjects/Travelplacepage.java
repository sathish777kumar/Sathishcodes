package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static Configuration.configurationclass.*;
import static Object.Objectclass.*;
import static UIWrapper.Wrapperclass.*;

public class Travelplacepage {

		@FindBy(id="matchStartPlace")
		WebElement From;
		
		@FindBy(xpath="//ul//li/a[text()='CHENNAI-PT Dr. M.G.R. BS']")
		WebElement Fromplace;
		
		@FindBy(id="matchEndPlace")
		WebElement To;
		
		@FindBy(xpath="//ul//li/a[text()='TIRUNELVELI']")
		WebElement Toplace;
			
		@FindBy(className="cal")
		WebElement calendar;
		
		@FindBy(xpath="//div[1]/table/tbody/tr/td[text()='29']")
		WebElement Date;
		
		@FindBy(name="txtAdultMales")
		WebElement clean;
		
		@FindBy(name="txtAdultMales")
		WebElement passgcount;
		
		@FindBy(className="btnTxt")
		WebElement Enter;
		
		WebDriver obj;
		
		public Travelplacepage(WebDriver obj) {
			
			this.obj = obj;
			PageFactory.initElements(obj, this);
		}
		
		public  void enterstartplace() throws Exception {
			
			sendKeys(From, Stpoint);
		}
		
		public  void selectstartplace() throws Exception {
					
					click(Fromplace);
				}
		
		public  void enterendplace() throws Exception {
			
			sendKeys(To, Stpoint);
		}
		
		public  void selectendplace() throws Exception {
			
			click(Toplace);
		}
		public  void calendr() throws Exception {
			
			click(calendar);
		}
		
		public  void selectdate() throws Exception {
			
			click(Date);
		}
		
		public  void clearoldvalue() throws Exception {
			
			clear(clean);
		}
		
		public  void noofpass() throws Exception {
			
			sendKeys(passgcount, noofpass);
		}

		public void clicksearch() throws Exception {
	
			click(Enter);
}
	
}
