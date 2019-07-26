package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Tc1VerifyNewtourslogin {

	public static void main(String[] args) {

		//open browser navigate to new tours
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		Sleeper.sleepTightInSeconds(5);
		
		//verify tours login

		driver.findElement(By.name("userName")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		driver.findElement(By.name("login")).click();
		
		System.out.println("Login succ TC pass");
	}

}
