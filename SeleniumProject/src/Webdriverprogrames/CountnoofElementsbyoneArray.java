package Webdriverprogrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class CountnoofElementsbyoneArray {

	public static void main(String[] args) {

		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sathya");

		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://spicejet.com");
		
		
List<WebElement>Element=driver.findElements(By.tagName("a"));
System.out.println("no of links are"+" "+Element.size());

Element=driver.findElements(By.tagName("select"));
System.out.println("no of dropdowns are"+"  "+Element.size());

Element=driver.findElements(By.tagName("img"));
System.out.println("no of image are"+"  "+Element.size());

Element=driver.findElements(By.xpath("//input[@type='radio']"));
System.out.println("no of radios are"+"  "+Element.size());
		
Element=driver.findElements(By.xpath("//input[@type='checkbox']"));
System.out.println("no of checks are"+"  "+Element.size());
						
Element=driver.findElements(By.xpath("//input[@type='text']"));
System.out.println("no of text fileds are"+"  "+Element.size());
		
			
		
		
		
		
		
		
		
		
		
		
	}

}
