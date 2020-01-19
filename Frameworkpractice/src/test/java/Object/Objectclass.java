package Object;

import org.openqa.selenium.By;

public class Objectclass {
	
public static By pwindowclick = By.xpath("//html/body/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/table/tbody/tr[3]/td/a/img[@src='images/eTicket_button.jpg']");
public static By cwwindowclick = By.xpath("//tbody/tr/td[2]/table/tbody/tr/td[7]/div/a[text()='LOGIN']");



public static By Start = By.id("matchStartPlace");
public static By Startclick = By.xpath("//ul//li/a[text()='CHENNAI-PT Dr. M.G.R. BS']");
public static By End = By.id("matchEndPlace");
public static By Endclick = By.xpath("//ul//li/a[text()='TIRUNELVELI']");
public static By calendar = By.className("cal");
public static By date = By.xpath("//div[1]/table/tbody/tr/td[text()='29']");
public static By passenger = By.name("txtAdultMales");
public static By bus = By.className("btnTxt");




public static By Book = By.xpath("//tbody/tr[1]/td[2]/table/tbody[2]/tr[2]/td[10]/div/div/a[text()='Book']");
public static By p1age = By.xpath("//table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[3]/td[3]/div/input[@type='text']");
public static By p2name = By.xpath("//table/tbody/tr/td/div/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[6]/td[2]/div/input[@type='text']");


public static By p2age = By.xpath("//td[2]/table/tbody/tr/td/div/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[6]/td[3]/div/input[@type='text']");
public static By p3name = By.xpath("//tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[7]/td[2]/div/input[@type='text']");
public static By p3age = By.xpath("//tbody/tr/td/div/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[7]/td[3]/div/input[@type='text']");
public static By mobile = By.name("txtPhoneNo");
public static By submit = By.xpath("//tbody/tr[4]/td/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[3]/div/a[text()='Submit']");
public static By makepay = By.xpath("//table/tbody/tr/td[3]/div/a[text()='Make Payment']");
public static By idproof = By.name("selectIdProof");
}
