package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithBookstrap {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
       pr=new ProfilesIni();
       fp=pr.getProfile("sathya");
      driver=new FirefoxDriver();
     driver.get("http://www.paytm.com");
}
	@Test
	public void data(){
driver.findElement(By.xpath(".//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div")).click();
driver.switchTo().frame(0);
driver.findElement(By.id("input_0")).sendKeys("ramki.trainer@gmail.com");
driver.findElement(By.xpath(".//*[@id='input_1']")).sendKeys("i dont no");
driver.findElement(By.xpath(".//*[@id='loginForm']/div/md-content/button")).click();


	}
	
	
	
	
	
	
	
	
	
	
}
