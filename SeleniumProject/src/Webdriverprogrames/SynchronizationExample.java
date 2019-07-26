package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationExample {

	public static void main(String[] args) throws InterruptedException {

	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("sathya");
	
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://google.com");

	WebDriverWait wait=new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.presenceOfElementLocated
		                                (By.linkText("Gmail")));

driver.findElement(By.linkText("Gmail")).click();





	
	
	
		
		
		
		
		
		
	}

}
