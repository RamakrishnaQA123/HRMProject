package WorkingwithApachiPOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetdatafromWebapplication {
	
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	FileInputStream fso;
	XSSFWorkbook wbo;
	XSSFSheet wso;
	FileOutputStream fo;
	@BeforeTest
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("sathya");
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
	}
	@Test
	public void getdata() throws IOException{
		fso=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Demofile.xlsx");
		wbo=new XSSFWorkbook(fso);
		wso=wbo.getSheet("sheet1");
		Row r;
		
	
	WebElement dropdown=driver.findElement(By.name("country"));
	List<WebElement>values=dropdown.findElements(By.tagName("option"));
	for(int i=0;i<values.size();i++){
		r=wso.createRow(i);
		r.createCell(0).setCellValue(values.get(i).getText());
	}
	
	
	
		fo=new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\Demofile.xlsx");
		wbo.write(fo);
		driver.close();
	}
	
	

}
