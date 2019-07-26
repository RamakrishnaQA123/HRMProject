package Frameworks;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Tc1 {
		FirefoxDriver driver;
		HRMlogin page;
		HRMLogout page2;
		
		@Test
		public void operation(){
			driver=new FirefoxDriver();
			driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
page=PageFactory.initElements(driver, HRMlogin.class);
page2=PageFactory.initElements(driver, HRMLogout.class);
page.login("Admin", "admin123");
Sleeper.sleepTightInSeconds(5);
page2.logout();






			
			
			
		
	}

}
