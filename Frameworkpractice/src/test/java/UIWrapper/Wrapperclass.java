package UIWrapper;

import static Configuration.configurationclass.URL;
import static Configuration.configurationclass.Uname;

import static Object.Objectclass.idproof;
import static Object.Objectclass.passenger;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Baseclass.Baseclass.*;

public class Wrapperclass {
	
	public static void sendKeys(WebElement ele, String text) throws Exception {
		ele.sendKeys(text);
	
	}
	
	public static void enterdata(By Object, String text) throws Exception {
		
		obj.findElement(Object).sendKeys(text);
	}
	
	public static void click(WebElement ele) throws Exception {
		ele.click();
	}
	
	public static void clear(WebElement ele) throws Exception {
		ele.clear();
	}
	
public static void URLs(String text) throws Exception {
		
			obj.get(text);
	}

public static void clik(By Object) throws Exception {
	
	obj.findElement(Object).click();
	
		}

public static  String window() throws Exception {
	
	return obj.getWindowHandle();
}

public static Set<String> newwindow() throws Exception {
	
	return obj.getWindowHandles();
}

public static void toggle(String child) throws Exception {

	obj.switchTo().window(child);
}

public static void jet (By fed) throws Exception {
	
	obj.findElement(fed).clear();
}

public static List<WebElement> news() throws Exception {
	
	return obj.findElements(By.className("seatAvailable"));
}

public static WebElement rest(By net) throws Exception {
	
	return obj.findElement(net);
	
}

public static Alert bet() throws Exception {
	
	return obj.switchTo().alert();
}

}
	


