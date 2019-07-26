package Frameworks;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Tc1Scriptbyreusablemethods {
	
	Reusablemethods RM;
	FirefoxDriver driver;
	Screenshots sc;
	@Test
	public void tc1() throws IOException{
		RM=new Reusablemethods();
		sc=new Screenshots();
		RM.open();
		sc.capture123(driver, "Locatoion");
		RM.login("Admin","admin123");
		sc.capture123(driver, "my location");
		Sleeper.sleepTightInSeconds(5);
		RM.verifylogin();
		sc.capture123(driver, "my location");
		RM.logout();
		RM.close();
		
	}

}
