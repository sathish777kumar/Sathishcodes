package UIwrapper;

import static Configuration.configclass.uname;
import static Configuration.configclass.url;
import static Object.objectclass.user;
import static Baseclass.Baseclass.*;

import org.openqa.selenium.By;

public class Wrapperclass {
	
	public static void LINK(String abc) throws Exception {
		
		obj.get(abc);
	}
	
	public static void entrydata(By don, String den) throws Exception {
		
		obj.findElement(don).sendKeys(den);
		
		}
	
public static void clik(By don) throws Exception {
		
		obj.findElement(don).click();
		
		}
	
	

}
