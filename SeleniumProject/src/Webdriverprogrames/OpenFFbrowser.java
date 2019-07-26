package Webdriverprogrames;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class OpenFFbrowser {

	public static void main(String[] args) {

		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sathya");
				
	FirefoxDriver driver=new FirefoxDriver(fp);
	driver.get("http://google.com");
	
	
	
  
	}

}
