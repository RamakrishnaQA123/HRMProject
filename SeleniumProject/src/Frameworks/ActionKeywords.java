package Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionKeywords {
	FirefoxDriver driver;
	public void launchbrowser(){
		driver=new FirefoxDriver();
	}
	public void navigate(){
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	public void enterusername(){
driver.findElement(By.id("txtUsername")).clear();
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	public void enterpassword(){
driver.findElement(By.id("txtPassword")).clear();
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	public void login(){
		driver.findElement(By.id("btnLogin")).click(); 
	}
	
	
	
	

}
