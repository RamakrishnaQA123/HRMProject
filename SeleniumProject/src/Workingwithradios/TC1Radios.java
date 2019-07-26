package Workingwithradios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class TC1Radios {

	public static void main(String[] args) {

		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sathya");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://mercurytravels.co.in");
		
List<WebElement>radios=driver.findElements(By.xpath("//input[@type='radio']"));
	
	System.out.println(radios.size());
	
	for(int i=0;i<radios.size();i++){
		
		System.out.println(radios.get(i).getAttribute("name")+"  "+radios.get(i).getAttribute("checked"));
	}
		
		
		
	}

}
