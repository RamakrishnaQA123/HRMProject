package Webdriverprogrames;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JS1234 {

	
	public static void main(String[] args) throws InterruptedException {

		
	   FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("http://google.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,5000)");

		//  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		
		 
		  Thread.sleep(3000); 

		 
		  js.executeScript("window.history.forward()");
	}

}
