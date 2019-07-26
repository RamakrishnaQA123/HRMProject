package Webdriverprogrames;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workingwithpopups {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
	}
	@Test
	
	public void handelpopups() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
	     Set<String> pops=driver.getWindowHandles();
	      Iterator <String> it =pops.iterator();
	      while (it.hasNext()) {
	    	 
	      String popupHandle=it.next().toString();
	          if(!popupHandle.contains(parent))
	          {
	          driver.switchTo().window(popupHandle);
	Sleeper.sleepTightInSeconds(5);
	driver.findElement(By.xpath(".//*[@id='tabs-wrapper']/div[2]/div[2]/a")).click();
	          }
	      }
	     
}

}
