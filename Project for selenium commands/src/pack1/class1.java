package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
	
	public static void main (String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Desktop\\chromedriver.exe");
		
		WebDriver obj = new ChromeDriver();
		
		obj.manage().window().maximize();
	
		obj.navigate().to("https://www.instagram.com");
		
		String d= obj.findElement(By.xpath("//div[7]/div/button[@type='submit']")).getText();
		
		System.out.println(d);
	}
	
	

}
