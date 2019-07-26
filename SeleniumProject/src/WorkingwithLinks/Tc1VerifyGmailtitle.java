package WorkingwithLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Tc1VerifyGmailtitle {

	public static void main(String[] args) {

		//open browser navigate to ICICI
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sathya");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.icicibank.com/");
		
		//count no of links
		
	  List<WebElement>links=driver.findElements(By.tagName("a"));
	  
	  System.out.println("no of links are"+" "+links.size());



















		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
