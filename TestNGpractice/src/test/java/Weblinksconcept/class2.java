package Weblinksconcept;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class2 {

	
	@Test
	
	public static void test () throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Downloads\\chromedriver.exe");
		
		WebDriver obj = new ChromeDriver();
		
		obj.manage().window().maximize();
		obj.get("https:www.google.com");
		obj.findElement(By.name("q")).sendKeys("testing champion");
		Thread.sleep(3000);
		obj.findElement(By.name("btnK")).click();
		
		int i=0;
		
		int j=0;
		int s= 0;
	
		do {
			
			if (i!=0) {
			
			obj.findElement(By.linkText("Next")).click();
		}
			
			List <WebElement> test = obj.findElements(By.xpath("//h3"));
			
			for (WebElement link : test) {
				
				String value = link.getText();
				
				if (value.equalsIgnoreCase("Heart of a Champion - Atrium Health")){
				
				link.click();
				
				j=1;
			}
			
			if (j==1) {
				
				s=1;
				break;
			}
			
			if (s==1){
				
				break;
			}
				
				
		
		}
		
		i=i+1;
		
		}
		
		while (obj.findElement(By.linkText("Next")).isDisplayed());
		
	}

}
	
