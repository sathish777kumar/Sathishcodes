package Generalmethods;

import static Object.Objectclass.idproof;
import static Object.Objectclass.pwindowclick;
import static UIWrapper.Wrapperclass.bet;
import static UIWrapper.Wrapperclass.clik;
import static UIWrapper.Wrapperclass.news;
import static UIWrapper.Wrapperclass.newwindow;
import static UIWrapper.Wrapperclass.rest;
import static UIWrapper.Wrapperclass.toggle;
import static UIWrapper.Wrapperclass.window;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class generalmethod {
	
	public static void det() throws Exception {
		
		List<WebElement> seats = news();
		
		for(WebElement seat : seats){
							
				for (int i=1;i<4;i++){
					
					seats.get(i).click();
					
				}
		}
	}

	public static void ops() throws Exception {
		
		Alert disp = bet();
		System.out.println(disp.getText());
		disp.accept();
	}
	
	public static void tan() throws Exception {
		
		Select mydrpdwn = new Select(rest(idproof));
		
		mydrpdwn.selectByIndex(9);
	}
	
	public static void win() throws Exception {
		
String pcode = window();
		
		System.out.println("Parent code is:"+pcode);
		
		clik(pwindowclick);
		
		Thread.sleep(4000);
		
		for(String ccode:newwindow())
		{
			
			if (ccode!=pcode) {
			String childWindow = ccode;
			
			toggle(childWindow);
			}
		
			}
	}
}
