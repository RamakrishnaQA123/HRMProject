package Workingwithcheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Tc1Checkboxes {

	public static void main(String[] args) {

		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sathya");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		

		
	List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	System.out.println(checkboxes.size());
	
for(int i=0;i<checkboxes.size();i++)	{
	System.out.println(checkboxes.get(i).getAttribute("name")+"   "+checkboxes.get(i).getAttribute("checked"));
}
		
		
		
		
		
	}

}
