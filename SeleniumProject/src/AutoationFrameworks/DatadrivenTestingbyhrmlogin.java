package AutoationFrameworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenTestingbyhrmlogin {
	
	       ProfilesIni pr;
	       FirefoxProfile fp;
	      FirefoxDriver driver;
	      FileInputStream fso;
	      XSSFWorkbook wbo;
	      XSSFSheet wso;
	      FileOutputStream fo;
	      
	     @BeforeTest
	     public void open(){
	driver=new FirefoxDriver();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	     }
	    @Test
	    public void datadrive() throws IOException{
	 fso=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Sample.xlsx");
	  wbo=new XSSFWorkbook(fso);
	   wso=wbo.getSheet("sheet2");	
	Row r;
	int rowc=wso.getLastRowNum();
	  for(int i=0;i<rowc;i++){
		  r=wso.getRow(i);
driver.findElement(By.id("txtUsername")).clear();
driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
driver.findElement(By.id("txtPassword'")).clear();
driver.findElement(By.id("txtPassword'")).sendKeys(r.getCell(1).getStringCellValue());
driver.findElement(By.id("btnLogin")).click();

String Actual=driver.getCurrentUrl();
r.createCell(3).setCellValue(Actual);

String Expected=r.getCell(2).getStringCellValue();

if(Expected.equals(Actual)){
	r.createCell(4).setCellValue("pass");
}
else{
	r.createCell(4).setCellValue("fail");
}		  		
driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");		  
	  }	    		    	
	fo=new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\Sample.xlsx");
	wbo.write(fo);
	    	
	    	
	    	
	    	
	    }
	    
	
		
		
	}
	
	
	
	
	


