package projecthomework.projecthomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practo {
	
	public static void main (String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Desktop\\chromedriver.exe");
		
		WebDriver mobile = new ChromeDriver();
		
		mobile.manage().window().maximize();
		
		mobile.get("https://www.practo.com/");
		
		mobile.findElement(By.xpath("//div[2]/div[1]/input[@autocomplete='off']")).sendKeys("Dentist");
		
		Thread.sleep(2000);
		
		mobile.findElement(By.xpath("//div[2]/div[2]/div[1]/div[1]/span[1]/div[text()='Dentist']")).click();
		
		Thread.sleep(2000);
		
		mobile.findElement(By.xpath("//div[7]/div/div[2]/div/div[2]/div/div/button[3]/span[2][text()='Book Appointment']")).click();

	}

}
