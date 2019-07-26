package WorkingwithTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNGTC {

	@BeforeTest
	public void open(){
		System.out.println("open browser navigate to Url");
	}
	@Test()
	public void register(){
		System.out.println("register for new account");
	}
	@Test(priority=1)
	public void login(){
		System.out.println("login into Application");
	}
	
	@Test(priority=2)
	public void composereport(){
		System.out.println("compose report to TL");
	}
	@Test(priority=3)
	public void sendmail(){
		System.out.println("send mail To TL");
	}
	@Test(priority=4)
	public void logout(){
		System.out.println("logout from Application");
	}
	@AfterTest
	public void close(){
		System.out.println("close browser");
	}
	
	
	
	

}
