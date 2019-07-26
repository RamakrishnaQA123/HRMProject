package Frameworks;

import java.io.IOException;

import org.testng.annotations.Test;

public class ModularScript1TC1 {
	Reusablemethods md1;
	
	@Test
	public void Tc1() throws IOException{
		md1=new Reusablemethods();
		
		//open browser
		md1.open();
		
		//login Script
		md1.login("admin","admin123");
		
		//Check login
		md1.verifylogin();
		
		//logout
		md1.logout();
		
		//close
		md1.close();
	}

}
