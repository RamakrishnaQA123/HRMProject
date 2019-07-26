package Frameworks;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adduser {
	public Menu menu=null;
	public  Adduser(WebDriver driver){
	menu=PageFactory.initElements(driver,Menu.class);
	
}
@FindBy(xpath="//*[@id='menu_pim_viewPimModule']/b")	
WebElement pim;

@FindBy(linkText="Add Employee")
WebElement AddEMP;

@FindBy(id="firstName")
WebElement fname;

@FindBy(id="middleName")
WebElement mname;

@FindBy(id="lastName")
WebElement lname;

@FindBy(id="employeeId")
WebElement EMPID;

@FindBy(id="systemUserSaveBtn")
WebElement save;

public void Addinguser(String f,String m,String l,String EI){
	pim.click();
	AddEMP.click();
	Sleeper.sleepTightInSeconds(10);
	fname.sendKeys(f);
	mname.sendKeys(m);
	lname.sendKeys(l);
	EMPID.sendKeys(EI);
	save.click();
	




}
	
	
	
	
}