package Webdriverprogrames;

import org.openqa.selenium.opera.OperaDriver;

public class OpenOperabrowser {

	public static void main(String[] args) {

		
	System.setProperty("webdriver.opera.driver", 
	"C:\\Users\\LENOVO\\Downloads\\operadriver_win64\\operadriver.exe");
	
		OperaDriver driver=new OperaDriver();
		driver.get("http://yahoo.com");
		
	}

}
