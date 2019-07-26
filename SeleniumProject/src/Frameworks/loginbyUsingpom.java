package Frameworks;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;

public class loginbyUsingpom {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		
		
		HRMlogin page1=PageFactory.initElements(driver, HRMlogin.class);
		HRMLogout page2=PageFactory.initElements(driver, HRMLogout.class) ;
	   page1.login("Admin","admin123");
	   
		
Sleeper.sleepTightInSeconds(3);	

   page2.logout();

		

	}

}
