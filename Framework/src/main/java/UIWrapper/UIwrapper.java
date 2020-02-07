package UIWrapper;

import org.openqa.selenium.By;

import Basepackage.Baseclass;

public class UIwrapper extends Baseclass {
	
public static void enterdata(By Object, String text){
	
	  obj.findElement(Object).sendKeys(text);
	
	}

public static void signin(By Object){
	
		obj.findElement(Object).click();
}

public static void URLs ( String URL) {
	
	obj.get(URL);
}

}
