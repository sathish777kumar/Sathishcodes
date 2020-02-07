package practice.practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class class2 extends AppTest{
	
	@Test
	
public void testcase2() {
		
		desk.get("https://www.google.com");
		
		desk.findElement(By.name("q")).sendKeys("achievement");
	}


}
