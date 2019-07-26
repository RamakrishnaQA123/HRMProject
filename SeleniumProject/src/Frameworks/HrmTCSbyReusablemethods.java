package Frameworks;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class HrmTCSbyReusablemethods {
	
	Reusablemethods rm;
	Screenshots ss;
	FirefoxDriver driver;
	
	
	@Test
	public void Tc() throws IOException{
		
	 rm=new Reusablemethods();
	 ss=new Screenshots();
	 rm.open();
	 ss.capture123(driver, "Location for Scrrenshot");
	 
	 rm.login("Admin","admin123");
	 Sleeper.sleepTightInSeconds(3);
	 ss.capture123(driver, "location for Screenshot");
	
	 rm.logout();
	 rm.close();
		
		
		
	}

}
