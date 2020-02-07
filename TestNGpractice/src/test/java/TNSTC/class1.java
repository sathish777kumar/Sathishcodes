package TNSTC;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class class1 {
	
	@Test
	
	public static void bet () throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Downloads\\chromedriver.exe");
		
		WebDriver obj = new ChromeDriver();
		
		obj.manage().window().maximize();
		
		obj.get("https://www.tnstc.in/TNSTCOnline/");
		
		obj.findElement(By.xpath("//tbody/tr/td[2]/table/tbody/tr/td[7]/div/a[text()='LOGIN']")).click();
		
		Thread.sleep(4000);
		
		obj.findElement(By.name("txtUserLoginID")).sendKeys("sathish777kumar");
		
		obj.findElement(By.name("txtPassword")).sendKeys("JESUSSATHISH");
		
		obj.findElement(By.className("dboxheader")).click();
		Thread.sleep(3000);
		
		obj.findElement(By.id("matchStartPlace")).sendKeys("CHENNAI");
		
	Thread.sleep(3000);
		
		obj.findElement(By.xpath("//ul//li/a[text()='CHENNAI-PT Dr. M.G.R. BS']")).click();
		
		Thread.sleep(3000);
		
		
		obj.findElement(By.id("matchEndPlace")).sendKeys("TIRUNELVELI");
		Thread.sleep(3000);
		
		obj.findElement(By.xpath("//ul//li/a[text()='TIRUNELVELI']")).click();
		
		obj.findElement(By.className("cal")).click();
		
		obj.findElement(By.xpath("//div[1]/table/tbody/tr/td[text()='29']")).click();
		
		obj.findElement(By.name("txtAdultMales")).clear();
		
		obj.findElement(By.name("txtAdultMales")).sendKeys("3");
		
		obj.findElement(By.className("btnTxt")).click();
		
		obj.findElement(By.xpath("//tbody/tr[1]/td[2]/table/tbody[2]/tr[2]/td[10]/div/div/a[text()='Book']")).click();
		
		Thread.sleep(2000);
		obj.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[3]/td[3]/div/input[@type='text']")).sendKeys("27");
		
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//table/tbody/tr/td/div/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[6]/td[2]/div/input[@type='text']")).sendKeys("VENKY");
		
		obj.findElement(By.xpath("//td[2]/table/tbody/tr/td/div/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[6]/td[3]/div/input[@type='text']")).sendKeys("27");
		
		obj.findElement(By.xpath("//tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[7]/td[2]/div/input[@type='text']")).sendKeys("SAM");
		
		obj.findElement(By.xpath("//tbody/tr/td/div/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[7]/td[3]/div/input[@type='text']")).sendKeys("37");
		
					
			List<WebElement> seats = obj.findElements(By.className("seatAvailable"));
			
						
						
			for(WebElement seat : seats){
								
					for (int i=1;i<4;i++){
						
						seats.get(i).click();
						

					}
			}
			
	
			
			
		Select mydrpdwn = new Select(obj.findElement(By.name("selectIdProof")));
		
		mydrpdwn.selectByIndex(9);
		
		obj.findElement(By.name("txtPhoneNo")).sendKeys("9094019663");
		
		obj.findElement(By.xpath("//tbody/tr[4]/td/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[3]/div/a[text()='Submit']")).click();
		
		Thread.sleep(5000);
		Alert disp = obj.switchTo().alert();
		System.out.println(disp.getText());
			
		disp.accept();
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//table/tbody/tr/td[3]/div/a[text()='Make Payment']")).click();
	}

}
	

