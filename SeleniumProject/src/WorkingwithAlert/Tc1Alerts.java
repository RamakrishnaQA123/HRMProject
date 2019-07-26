package WorkingwithAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1Alerts {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
       pr=new ProfilesIni();
       fp=pr.getProfile("sathya");
      driver=new FirefoxDriver();
     driver.get("http://demo.automationtesting.in/Alerts.html");
}
	@Test
	public void task(){
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath(".//*[@id='Textbox']/button")).click();
		
	Sleeper.sleepTightInSeconds(3);
		driver.switchTo().alert().sendKeys("ramki.trainer@gmail.com");
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
