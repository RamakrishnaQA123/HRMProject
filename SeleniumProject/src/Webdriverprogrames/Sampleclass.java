package Webdriverprogrames;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sampleclass {

	public static void main(String[] args) {

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		
		
		
		
		
		
	}

}
