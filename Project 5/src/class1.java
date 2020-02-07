import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class class1 {
	
	public static void main (String args[])throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Desktop\\chromedriver.exe");
	
	WebDriver obj = new ChromeDriver();
	
	obj.manage().window().maximize();
	
	obj.get("https://www.google.com");
	
	obj.findElement(By.name("q")).sendKeys("Practiceit");
	
	Thread.sleep(2000);
	
	obj.findElement(By.name("btnK")).click();
	
	Thread.sleep(2000);
	
	obj.findElement(By.className("LC20lb")).click();
	
String a = obj.getCurrentUrl();

System.out.println(a);


	
	
		
		
	}

}
