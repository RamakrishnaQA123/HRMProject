package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LoginbyXpathCreation {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sathya");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		
driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mercury");
driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
		
		
		
		
		
	}

}
