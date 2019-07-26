package Frameworks;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;

public class HRMLoginbyPageObjects {

	public static void main(String[] args) {

		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
	
		//verify login
		HRMlogin page=PageFactory.initElements(driver, HRMlogin.class);
		Adduser page2=PageFactory.initElements(driver, Adduser.class);
		HRMLogout page3=PageFactory.initElements(driver, HRMLogout.class);
		page.login("Admin", "admin123");
		Sleeper.sleepTightInSeconds(3);
	//	page2.Addinguser("Ramakrishna", "RK", "QA", "1023", "Australia");
		Sleeper.sleepTightInSeconds(3);
		
		page3.logout();
		
	}

}
