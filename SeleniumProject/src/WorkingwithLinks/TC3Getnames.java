package WorkingwithLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class TC3Getnames {

	public static void main(String[] args) {

		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sathya");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		
		
	List<WebElement>links=driver.findElements(By.tagName("a"));
	for(int i=0;i<links.size();i++){
		if(links.get(i).isDisplayed()){
			String name=links.get(i).getText();
			links.get(i).click();
		String url=driver.getCurrentUrl();
		driver.navigate().back();
		System.out.println(name+"  "+url);
		links=driver.findElements(By.tagName("a"));
		
		}
	}
		
		
		
		
		
		
		
		
		
		















		
		
	
	
		
		
		
		
		
		
		
		
	}

}
