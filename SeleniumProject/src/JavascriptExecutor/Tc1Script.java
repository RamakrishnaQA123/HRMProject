package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1Script {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
       pr=new ProfilesIni();
       fp=pr.getProfile("sathya");
      driver=new FirefoxDriver();
     driver.get("https://www.facebook.com/");
     
}
@Test
public void data() throws InterruptedException{
JavascriptExecutor js=(JavascriptExecutor)driver;

//js.executeScript("window.scrollBy(0,5000)");

js.executeScript("window.scrollBy(0,document.body.scrollHeight)");






	
	
	
}
	

	
	
	
}
