package Frameworks;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Reusablemethods {

	  FirefoxDriver driver;
	@BeforeTest
	public void open() throws IOException{
	driver=new FirefoxDriver();
	driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
	}
	
	@Test(priority=1)
	public void login(String u,String p) throws IOException{
	driver.findElement(By.id("txtUsername")).clear();
	driver.findElement(By.id("txtUsername")).sendKeys(u);
	driver.findElement(By.id("txtPassword")).clear();
	driver.findElement(By.id("txtPassword")).sendKeys(p);
	driver.findElement(By.id("btnLogin")).click();
	Sleeper.sleepTightInSeconds(5);
	}
	//@Test
	public void verifylogin(){
		driver.findElement(By.id("user-dropdown")).click();
	String Actual=driver.findElement(By.linkText("Logout")).getText();
	String Expected="Logout";
	Assert.assertEquals(Expected, Actual);
	Sleeper.sleepTightInSeconds(3);
	}
	@Test(priority=2)
	public void logout(){
	driver.findElement(By.id("user-dropdown")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
}
