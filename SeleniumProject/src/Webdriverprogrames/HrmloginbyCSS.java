package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class HrmloginbyCSS {

	public static void main(String[] args) {

		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sathya");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
		
driver.findElement(By.cssSelector("#txtUsername")).clear();
driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");

driver.findElement(By.cssSelector("#txtPassword")).clear();
driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");

driver.findElement(By.cssSelector("#btnLogin")).click();

System.out.println("login succ");







		
		
		
		

	}

}
