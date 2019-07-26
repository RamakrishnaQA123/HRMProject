package Webdriverprogrames;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hrmloginbyusingproperties {
	private static Logger log=Logger.getLogger(Hrmloginbyusingproperties.class);
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;

		
		@BeforeTest
		public void open(){
			DOMConfigurator.configure("log4j.xml");
			pr=new ProfilesIni();
			FirefoxProfile fp=pr.getProfile("sathya");
			log.info("call profile Browser");
		driver=new FirefoxDriver();
		log.info("Succ Browser Opend");
			driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
			log.info("Succ Page navigated");
		}
	@Test
	public void data() throws IOException{
FileInputStream fso=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\July\\SeleniumProject\\Hrmlogin.properties");
Properties pr=new Properties();
pr.load(fso);
log.info("call properties");
driver.findElement(By.id(pr.getProperty("user"))).clear();
driver.findElement(By.id(pr.getProperty("user"))).sendKeys("Admin");
log.info("Succ Enter Username By using properties");
driver.findElement(By.id(pr.getProperty("pass"))).clear();
driver.findElement(By.id(pr.getProperty("pass"))).sendKeys("admin123");
log.info("Succ Enter Password by using Properties");
driver.findElement(By.id(pr.getProperty("log"))).click();
log.info("Succ Login Completed");

	}
		
		
		
		
		
		
		
}
