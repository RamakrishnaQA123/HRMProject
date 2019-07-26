package WorkingwithDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class TC1dropdown {

	
	public static void main(String[] args) {

		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sathya");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://mercurytravels.co.in");
		
		Sleeper.sleepTightInSeconds(3);

		Select dropdown=new Select(driver.findElement(By.id("themes")));
		dropdown.selectByIndex(1);
		
		
		
		
		
		
	}

}
