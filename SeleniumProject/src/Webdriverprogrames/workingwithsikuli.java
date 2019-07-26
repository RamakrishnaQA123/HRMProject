package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithsikuli {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
       pr=new ProfilesIni();
       fp=pr.getProfile("sathya");
      driver=new FirefoxDriver();
     driver.get("https://www.seleniumhq.org/download/");
}
	
	@Test
	public void data() throws FindFailed, InterruptedException{
	driver.findElement(By.linkText("3.141.59")).click();
	Thread.sleep(3000);
	Screen sn=new Screen();
	Pattern pt=new Pattern("C:\\Users\\LENOVO\\Desktop\\Capture1.PNG");
	sn.click(pt);
	
	
	
	}
}
