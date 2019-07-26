package Frameworks;

import java.awt.Menu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HRMLogout {
	
	public Menu menu=null;
	public HRMLogout(WebDriver driver){
menu=PageFactory.initElements(driver,Menu.class);
	}
		@FindBy(id="user-dropdown")
		WebElement drop;
		
		@FindBy(linkText="Logout")
		WebElement log;
		
		public void logout(){
			drop.click();
			log.click();
		
}
}
