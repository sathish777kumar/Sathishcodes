package sdfs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCticketbooking {
	
	
	public static void main(String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Desktop\\chromedriver.exe");
		
		WebDriver pen = new ChromeDriver ();
		
		pen.manage().window().maximize();
		
		pen.get("https://www.irctc.co.in/nget/train-search");
		
		pen.findElement(By.id("loginText")).click();
		
		Thread.sleep(2000);
		
		pen.findElement(By.id("userId")).sendKeys("mohbalaji");
		
		Thread.sleep(2000);
		
		pen.findElement(By.id("pwd")).sendKeys("9094019663");
		
		Thread.sleep(25000);
		
		pen.findElement(By.xpath("//form/button[text()='SIGN IN']")).click();
		
		pen.findElement(By.xpath("//span/input[@placeholder='From*']")).sendKeys("CHENNAI");
		
		Thread.sleep(2000);
		
		pen.findElement(By.xpath("//li/span[text()='MGR CHENNAI CTL - MAS']")).click();
		
		Thread.sleep(2000);
		
		pen.findElement(By.xpath("//span/input[@placeholder='To*']")).sendKeys("SECUNDER");
		
		Thread.sleep(2000);
		
		pen.findElement(By.xpath("//li/span[text()='SECUNDERABAD JN - SC']")).click();
		
		Thread.sleep(2000);
		
		pen.findElement(By.xpath("//p-calendar/span/button/span[@aria-hidden='true']")).click();
		
		Thread.sleep(2000);
		
		pen.findElement(By.xpath("//tr[5]/td[3]/a[@draggable='false']")).click();
		
		Thread.sleep(2000);
		
		pen.findElement(By.xpath("//div/button[@label='Find Trains']")).click();
		
		Thread.sleep(3000);
		
		JavascriptExecutor jse = ((JavascriptExecutor)pen);
		jse.executeScript("window.scrollBy(0,250)");
		
		Thread.sleep(3000);
		
		pen.findElement(By.xpath("//div[1]/div/app-train-avl-enq/div/div/div/div/div/div/button[text()=' Check availability & fare ']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
