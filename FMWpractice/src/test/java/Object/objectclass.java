package Object;

import org.openqa.selenium.By;

public class objectclass {
	
		public static By pwindow = By.xpath("//html/body/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/table/tbody/tr[3]/td/a/img[@src='images/eTicket_button.jpg']");
		public static By cwindow = By.xpath("//tbody/tr/td[2]/table/tbody/tr/td[7]/div/a[text()='LOGIN']");
		public static By user = By.name("txtUserLoginID");
		public static By pwd = By.name("txtPassword");
		public static By sign= By.className("dboxheader");
		public static By starts = By.id("matchStartPlace");
		public static By startplace = By.xpath("//ul//li/a[text()='CHENNAI-PT Dr. M.G.R. BS']");
		public static By ends = By.id("matchEndPlace");
		public static By endplace = By.xpath("//ul//li/a[text()='TIRUNELVELI']");
	
}
