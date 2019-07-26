package Webdriverprogrames;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEbrowser {

	public static void main(String[] args) {

System.setProperty("webdriver.ie.driver","C:\\Users\\LENOVO\\Downloads\\IEDriverServer.exe");		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");
	}

}
