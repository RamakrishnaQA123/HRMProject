package WorkingwithScrrenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ScrrenshotExample {

	public static void main(String[] args) throws IOException {

		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sathya");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.google.com");
		
		
		
List<WebElement>links=driver.findElements(By.tagName("a"));

for(int i=0;i<links.size();i++){
	if(links.get(i).isDisplayed()){
		String lname=links.get(i).getText();
		links.get(i).click();
	
		Sleeper.sleepTightInSeconds(3);
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile,new File("C:\\Users\\LENOVO\\Desktop\\"+lname+".png"));
	
	driver.navigate().back();
	
	links=driver.findElements(By.tagName("a"));
	
	
	}
}
		












		
		
		
	}

}
