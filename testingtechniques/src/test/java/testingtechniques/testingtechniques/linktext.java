package testingtechniques.testingtechniques;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {
	
	public static void main (String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Desktop\\chromedriver.exe");
		
		WebDriver yark = new ChromeDriver();
		
		yark.get("https://www.google.com");
		
		yark.findElement(By.name("q")).sendKeys("Testing techniques");
		
		yark.findElement(By.name("btnK")).click();
		
		do {
			
			if 
		}
		
		List<WebElement> word = yark.findElements(By.xpath("//a/h3"));
		
		for (WebElement ele : word) {
			
			if (ele.getText().contains("Software testing - Wikipedia")) {
				
				ele.click();
				break;
			}
		}
	}

}
