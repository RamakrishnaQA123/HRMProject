package Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1counttext {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
       pr=new ProfilesIni();
       fp=pr.getProfile("sathya");
      driver=new FirefoxDriver();
     driver.get("http://www.newtours.demoaut.com/");
	}
	
	@Test
	public void Register(String f,String l,String p,String E,String ad1,String c,String s,String pc,String ct){
driver.findElement(By.linkText("REGISTER")).click();

driver.findElement(By.name("firstName")).sendKeys(f);
driver.findElement(By.name("lastName")).sendKeys(l);
driver.findElement(By.name("phone")).sendKeys(p);
driver.findElement(By.id("userName")).sendKeys(E);
driver.findElement(By.name("address1")).sendKeys(ad1);
driver.findElement(By.name("city")).sendKeys(c);
driver.findElement(By.name("state")).sendKeys(s);
driver.findElement(By.name("postalCode")).sendKeys(pc);
driver.findElement(By.name("country")).sendKeys(ct);
driver.findElement(By.id("email")).sendKeys("QA123");
driver.findElement(By.name("password")).sendKeys("12345");
driver.findElement(By.name("confirmPassword")).sendKeys("12345");
driver.findElement(By.name("register")).click();
Sleeper.sleepTightInSeconds(3);
	}
@Test
public void verifyRegister(){
String Actual=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
String Expected="QA123";
if(Actual.contains(Expected)){
	System.out.println("Regsitration Succ");
}
else{
	System.out.println("Registration Fail");
}

driver.close();

}








	
	
	
	
	
	
	
	
	
	
	
}
