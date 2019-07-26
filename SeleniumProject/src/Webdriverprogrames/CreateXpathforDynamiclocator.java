package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class CreateXpathforDynamiclocator {

	public static void main(String[] args) {

		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sathya");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		
	driver.findElement(By.linkText("Create a Rediffmail account")).click();
		
	driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("Ramakrishna");
	
	}

}
