package webpack;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class firefoxProfileCreatioin {
WebDriver d;
	@Test
	public void text() throws Exception {
		
//		ProfilesIni profile = new ProfilesIni();
//		
//		FirefoxProfile ffprofile = profile.getProfile("selva");
//		
//		WebDriver driver = new FirefoxDriver(ffprofile);
//		
		
		FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\Kavitha\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\pn9sc0cc.sisystems"));                  
		 d = new FirefoxDriver(profile);
		
		
	}
}
