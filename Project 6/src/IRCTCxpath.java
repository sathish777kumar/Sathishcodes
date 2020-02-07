import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IRCTCxpath {
	
	public static void mian (String args[])throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Desktop\\chromedriver.exe");
		
		WebDriver pen = new ChromeDriver ();
		
		pen.manage().window().maximize();
		
		pen.get("//https:www.google.com");
		
		pen.findElement(By.xpath("//div/input[@autocapitalize='off']")).sendKeys("IRCTC");
		
		pen.findElement(By.className("gNO89b")).click();
		
		pen.findElement(By.partialLinkText("IRCTC Next Generation")).click();
		
	}

}
