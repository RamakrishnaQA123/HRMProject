package Frameworks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Tc1HrmloginbyusingRM {
	
	
	Reusablemethods rm;
	Screenshots sc;
	WebDriver driver;
	@Test
	public void tc1() throws IOException{
		rm=new Reusablemethods();
		sc=new Screenshots();
		
		//open browser navigate to HRm
		rm.open();
		sc.capture123(driver,"Location");
		//login
		rm.login("Admin","admin123");
		sc.capture123(driver, "location");
		//verify login
		rm.verifylogin();
	Sleeper.sleepTightInSeconds(3);
		//logout
		rm.logout();
		sc.capture123(driver, "location");
		//close
		rm.close();
		
		
	}

}
