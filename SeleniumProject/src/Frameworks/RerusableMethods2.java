package Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RerusableMethods2 {
	WebDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	@Test
	public void registerlink(){
		driver.findElement(By.linkText("REGISTER")).click();
	}
	@Test
	public void register(String f,String l,String E,String A1,String c,String s,String ct,String u,String p1,String p2){
		driver.findElement(By.name("firstName")).sendKeys(f);	
		driver.findElement(By.name("lastName")).sendKeys(l);
		driver.findElement(By.id("userName")).sendKeys(E);
		driver.findElement(By.name("address1")).sendKeys(A1);
		driver.findElement(By.name("city")).sendKeys(c);
		driver.findElement(By.name("state")).sendKeys(s);
		driver.findElement(By.name("country")).sendKeys(ct);
		driver.findElement(By.id("email")).sendKeys(u);
		driver.findElement(By.name("password")).sendKeys(p1);
		driver.findElement(By.name("confirmPassword")).sendKeys(p2);
		driver.findElement(By.name("register")).click();
		
		
	}
}


