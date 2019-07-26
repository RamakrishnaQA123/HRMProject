package Frameworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven2 {
	FirefoxDriver driver;
	FileInputStream fso;
	XSSFWorkbook wbo;
	XSSFSheet wso;
	FileOutputStream fo;
	RerusableMethods2 obj;
	
@Test
public void data() throws IOException{
	obj=new RerusableMethods2();
	obj.open();
	obj.registerlink();
	fso=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\demo2.xlsx");
	  wbo=new XSSFWorkbook(fso);
	wso=wbo.getSheet("Sheet1");
	Row r;
int rowc=wso.getLastRowNum();
for(int i=1;i<=rowc;i++){
r=wso.getRow(i)	;

String Actual=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font"
		+ "                                   /b")).getText();
r.createCell(10).setCellValue(Actual);

String Expected=r.getCell(7).getStringCellValue();

if(Actual.contains(Expected)){
	r.createCell(11).setCellValue("pass");
}
else{
r.createCell(11).setCellValue("fail");
}
driver.navigate().back();
}
fo=new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\demo2.xlsx");
wbo.write(fo);	
}


	
	

}
