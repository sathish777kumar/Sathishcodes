package practice.practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class class1 extends AppTest{
	
	@Test
	
	public void testcase1() {
		
		desk.get("https://www.google.com");
		
		desk.findElement(By.name("q")).sendKeys("success");
	}

}
