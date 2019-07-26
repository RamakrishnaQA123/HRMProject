package Frameworks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Tc1Modulardriven {
	
	Reusablemethods RM;
	Screenshots sc;
	WebDriver driver;
	@Test
	public void operation() throws IOException{
		RM=new Reusablemethods();
		sc=new Screenshots();
		//open browser naviagte to page
		RM.open();
		sc.capture123(driver, "my location");
		//Login
		RM.login("Admin","admin123");
		//Verify Login
		RM.verifylogin();
		sc.capture123(driver, "my location");
		////Adduser
		/*-----
		-----
		-----*/
		
		RM.logout();
		RM.close();
		
	}

}
