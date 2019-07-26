package WorkingwithTestNG;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRMLoginByTestNG {
private static Logger log=Logger.getLogger(HRMLoginByTestNG.class);

ProfilesIni pr;
FirefoxProfile fp;
FirefoxDriver driver;

	@BeforeTest
	public void open(){
		DOMConfigurator.configure("log4j.xml");
		pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sathya");
		
	driver=new FirefoxDriver();
	log.info("browser opend Succ");
	driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
    log.info("page succ navigated");
	}
	@Test
	public void login(){
   driver.findElement(By.id("txtUsername")).clear();
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	log.info("Succ Username Enterd");
	driver.findElement(By.id("txtPassword")).clear();
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");	
	log.info("succ password Entered");
	driver.findElement(By.id("btnLogin")).click();
	Sleeper.sleepTightInSeconds(5);
	log.info("succ login completed");
	}
	@Test(priority=1)
	public void verifylogout(){
	driver.findElement(By.id("user-dropdown")).click();
	String Expected="Logout";
String Actual=driver.findElement(By.linkText("Logout")).getText();
Assert.assertEquals(Actual, Expected);
log.info("Succ Logout Verif");
	}
	@Test(priority=2)
	public void logout(){
	driver.findElement(By.linkText("Logout")).click();
	log.info("succ logout from page");
	
	}
	
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
	
	
	
}	
	
	
	
	