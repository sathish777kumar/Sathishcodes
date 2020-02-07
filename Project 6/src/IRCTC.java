import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IRCTC {
	
	public static void main (String args[]) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Desktop\\chromedriver.exe")	;	
		
        WebDriver obj = new ChromeDriver ();
        
        obj.manage().window().maximize();
        
        obj.get("https://www.irctc.co.in/nget/train-search");
        
        Thread.sleep(2000);
        
        obj.findElement(By.id("loginText")).click();
        
        Thread.sleep(2000);
        
        obj.findElement(By.id("userId")).sendKeys("mohbalaji");
        
        
        Thread.sleep(2000);
        
        obj.findElement(By.id("pwd")).sendKeys("9094019663");
        
        Thread.sleep(25000);
        
        obj.findElement(By.xpath("//form/button[text()='SIGN IN']")).click();
        
	}

}
