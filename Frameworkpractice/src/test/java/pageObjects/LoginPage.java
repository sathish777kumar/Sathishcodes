package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static UIWrapper.Wrapperclass.*;
import static Configuration.configurationclass.*;

public class LoginPage {
	
	
	@FindBy(name="txtUserLoginID")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(className="dboxheader")
	WebElement signIn;
	
	WebDriver obj1;
	
	public LoginPage(WebDriver rest) {
		
		this.obj1 = rest;
		PageFactory.initElements(rest, this);
	}
	
	
	public void enterUsername() throws Exception {
		sendKeys(username, Uname);
	}
	
	public void enterPassword() throws Exception {
		sendKeys(password, Pwd);
	}
	
	public void clickSubmit() throws Exception {
		click(signIn);
	}
}
