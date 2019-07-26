package Frameworks;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Log1byPOM {
	

	@Test
	public void Tc11(){
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		HRMlogin page1=PageFactory.initElements(driver, HRMlogin.class);
		Adduser page2=PageFactory.initElements(driver, Adduser.class);
		HRMLogout page3=PageFactory.initElements(driver, HRMLogout.class);
		
		page1.login("Admin", "admin123");
		Sleeper.sleepTightInSeconds(3);
		page2.Addinguser("Ramakrishna", "Tester", "QA", "1007");
		
		
		
	}
}
