package Frameworks;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC1hrmloginbyusingmethods {
	
	FirefoxDriver driver;
	Reusablemethods method;
	Screenshots sc;
	
	@Test
	public void operation() throws IOException{
		method=new Reusablemethods();
		sc=new Screenshots();
		method.open();
		method.login("Admin","admin123");
		sc.capture123(driver, "C:\\Users\\LENOVO\\Desktop\\login.png");
		//------
		//-------
		//--------
		method.logout();
		sc.capture123(driver, "C:\\Users\\LENOVO\\Desktop\\logout.png");
		method.close();
		
	}
	

}
