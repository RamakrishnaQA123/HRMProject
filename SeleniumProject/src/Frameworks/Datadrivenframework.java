package Frameworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class Datadrivenframework {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	FileInputStream fso;
	XSSFWorkbook wbo;
	XSSFSheet  wso;
	FileOutputStream fo;
	Reusablemethods med1;
	 Screenshots ss;
	
		@Test
	public void operation() throws IOException{
		 med1=new Reusablemethods();
		  ss=new Screenshots();
		 
		 med1.open();
		 ss.capture123(driver, "mylocation");
		 
		fso=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Sample.xlsx");
		  wbo=new XSSFWorkbook(fso);
		wso=wbo.getSheet("Sheet1");
		Row r;
		
int rowc=wso.getLastRowNum();
for(int i=1;i<=rowc;i++){  
	r=wso.getRow(i);                                               
	med1.login(r.getCell(0).getStringCellValue(),r.getCell(1).getStringCellValue());
String Actual=driver.getCurrentUrl();
r.createCell(3).setCellValue(Actual);

String Expected=r.getCell(2).getStringCellValue();

if(Expected.equals(Actual)){
	r.createCell(4).setCellValue("pass");
}
else{
	r.createCell(4).setCellValue("fail");
	
}
driver.navigate().to("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");		
}
fo=new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\Sample.xlsx");
wbo.write(fo);	
		
		
	}
	
	

}
