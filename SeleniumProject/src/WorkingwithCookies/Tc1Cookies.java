package WorkingwithCookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1Cookies {
	
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
       pr=new ProfilesIni();
       fp=pr.getProfile("sathya");
      driver=new FirefoxDriver();
     driver.get("https://www.mirror.co.uk/");
	}
	@Test
	public void data(){
		//count cookies
		Set<Cookie>mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
		
		//delete cookies
		driver.manage().deleteAllCookies();
		
		//count after delete
	mycookies=driver.manage().getCookies();	
	System.out.println(mycookies.size());
	
	
	
	
	
		
		
		
		
		
		
		
	}
}
