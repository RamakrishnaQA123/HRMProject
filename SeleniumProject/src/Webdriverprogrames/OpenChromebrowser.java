package Webdriverprogrames;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromebrowser {

	public static void main(String[] args) {

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe")	;
	
		
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://google.com");

}
}