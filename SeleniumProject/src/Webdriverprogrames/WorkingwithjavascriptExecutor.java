package Webdriverprogrames;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class WorkingwithjavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.mercurytravels.co.in/");
		
		
		
	JavascriptExecutor js=(JavascriptExecutor)driver;
   js.executeScript("document.getElementById('flights').click()");
   js.executeScript("document.getElementById('dpf1').value='19/08/2018'");
   js.executeScript("document.getElementById('dpf2').value='21/08/2018'");


		
		
		
		
	}

}
